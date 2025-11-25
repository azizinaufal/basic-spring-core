package naufalazizi.spring.core.processor;

import lombok.extern.slf4j.Slf4j;
import naufalazizi.spring.core.aware.IdAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class IdBeanGeneratorPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id generator processor for Bean {} ",beanName);
        if(bean instanceof IdAware){
            log.info("Set id generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }

        return  bean;
    }
}

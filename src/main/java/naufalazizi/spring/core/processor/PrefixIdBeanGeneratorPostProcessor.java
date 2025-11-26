package naufalazizi.spring.core.processor;

import lombok.extern.slf4j.Slf4j;
import naufalazizi.spring.core.aware.IdAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdBeanGeneratorPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Id generator processor for Bean {} ",beanName);
        if(bean instanceof IdAware){
            log.info("Set Prefix  id generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PZN- "+ idAware.getId() );
        }

        return  bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}

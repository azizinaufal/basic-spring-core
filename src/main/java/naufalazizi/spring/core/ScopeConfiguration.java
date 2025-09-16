package naufalazizi.spring.core;

import lombok.CustomLog;
import lombok.extern.slf4j.Slf4j;
import naufalazizi.spring.core.data.Bar;
import naufalazizi.spring.core.data.Foo;
import naufalazizi.spring.core.scope.DoubletonScope;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {
    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Crete new Bar");
        return new Bar();
    }
}

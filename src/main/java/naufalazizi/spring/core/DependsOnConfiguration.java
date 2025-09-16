package naufalazizi.spring.core;

import lombok.extern.slf4j.Slf4j;
import naufalazizi.spring.core.data.Bar;
import naufalazizi.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn(value={
            "bar"
    })
    public Foo foo(){
        log.info("Create Foo first");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar();
    }
}

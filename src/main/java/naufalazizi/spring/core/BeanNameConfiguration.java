package naufalazizi.spring.core;

import naufalazizi.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanNameConfiguration {
        @Primary
        @Bean(name="FooFirst")
        public Foo foo1(){
            return new Foo();
        }

        @Bean(name="FooSecond")
        public Foo foo2(){
            return new Foo();
        }
}

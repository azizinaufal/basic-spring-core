package naufalazizi.spring.core;

import naufalazizi.spring.core.data.Bar;

import naufalazizi.spring.core.data.Foo;
import naufalazizi.spring.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo fooFirst() {
        return new Foo();
    }
    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar foobar( @Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar( foo, bar);
    }
}

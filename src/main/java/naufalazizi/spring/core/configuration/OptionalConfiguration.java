package naufalazizi.spring.core.configuration;

import naufalazizi.spring.core.data.Bar;
import naufalazizi.spring.core.data.Foo;
import naufalazizi.spring.core.data.FooBar;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

public class OptionalConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}

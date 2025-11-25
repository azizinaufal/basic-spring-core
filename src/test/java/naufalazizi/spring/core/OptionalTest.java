package naufalazizi.spring.core;

import naufalazizi.spring.core.configuration.OptionalConfiguration;
import naufalazizi.spring.core.data.Foo;
import naufalazizi.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class OptionalTest {

    private ConfigurableApplicationContext context ;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testOptional(){
        Foo foo = context.getBean(Foo.class);
        FooBar fooBar = context.getBean(FooBar.class);

        Assertions.assertNull(fooBar.getBar());
        Assertions.assertSame(foo, fooBar.getFoo());
    }

}

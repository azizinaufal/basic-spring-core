package naufalazizi.spring.core.application;

import naufalazizi.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WithoutSpringBoot {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(FooApplication.class);
        context.registerShutdownHook();
    }

    @Test
    void testFoo() {
        Foo foo = context.getBean(Foo.class);

    }
}

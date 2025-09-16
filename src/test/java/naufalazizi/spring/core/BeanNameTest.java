package naufalazizi.spring.core;

import naufalazizi.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {

    private ApplicationContext context;
    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    void testBeanName() {
        Foo fooPrimary = context.getBean(Foo.class);
        Foo fooFirst = context.getBean("FooFirst", Foo.class);
        Foo fooSecond = context.getBean("FooSecond", Foo.class);

        Assertions.assertEquals(fooPrimary, fooFirst);
        Assertions.assertNotSame(fooPrimary, fooSecond);
    }
}

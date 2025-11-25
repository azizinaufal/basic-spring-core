package naufalazizi.spring.core;

import naufalazizi.spring.core.service.MerchanServiceImpl;
import naufalazizi.spring.core.service.MerchantService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritenceTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testInheritence(){
        MerchantService merchantService = context.getBean(MerchantService.class);
        MerchanServiceImpl merchanServiceImpl = context.getBean(MerchanServiceImpl.class);

        Assertions.assertSame(merchantService,merchanServiceImpl);
    }
}

package naufalazizi.spring.core;

import naufalazizi.spring.core.client.PaymentGatewayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class FactoryTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testFactory(){
        PaymentGatewayClient paymentGatewayClient = context.getBean(PaymentGatewayClient.class);
        Assertions.assertNotNull(paymentGatewayClient);

        Assertions.assertEquals("http://example.com", paymentGatewayClient.getEndpoint());
        Assertions.assertEquals("public", paymentGatewayClient.getPublicKey());
        Assertions.assertEquals("private", paymentGatewayClient.getPrivateKey());
    }


}

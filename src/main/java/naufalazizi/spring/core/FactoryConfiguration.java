package naufalazizi.spring.core;

import naufalazizi.spring.core.client.PaymentGatewayClient;
import naufalazizi.spring.core.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {

}

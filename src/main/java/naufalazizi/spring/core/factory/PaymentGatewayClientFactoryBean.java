package naufalazizi.spring.core.factory;

import naufalazizi.spring.core.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("paymentGatewatClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {
    @Override
    public PaymentGatewayClient getObject() throws Exception {

        PaymentGatewayClient client  = new PaymentGatewayClient();
        client.setEndpoint("http://example.com");
        client.setPublicKey("public");
        client.setPrivateKey("private");
        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}

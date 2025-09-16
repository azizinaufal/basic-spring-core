package naufalazizi.spring.core;

import naufalazizi.spring.core.data.Connection;
import naufalazizi.spring.core.data.Server;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @Test
    public void testConnection(){
        Connection connection = context.getBean(Connection.class);
        context.registerShutdownHook();
    }

    @AfterEach
    public void tearDown() {
//        context.close();
    }

    @Test
    void testServer(){
        Server server = context.getBean(Server.class);
    }


}

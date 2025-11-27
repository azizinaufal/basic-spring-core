package naufalazizi.spring.core;

import naufalazizi.spring.core.listener.LoginSuccessListener;
import naufalazizi.spring.core.listener.UserListener;
import naufalazizi.spring.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            UserListener.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testEvent(){
        UserService userService = context.getBean(UserService.class);
        userService.login("azizi", "azizi");
        userService.login("azizi", "salah");
        userService.login("naufal", "salah");
    }



}

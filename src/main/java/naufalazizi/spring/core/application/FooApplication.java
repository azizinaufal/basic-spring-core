package naufalazizi.spring.core.application;

import naufalazizi.spring.core.data.Bar;
import naufalazizi.spring.core.data.Foo;
import naufalazizi.spring.core.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FooApplication {
//
//
//
//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(FooApplication.class, args);
//        Foo foo = context.getBean(Foo.class);
//
//    }

//    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(FooApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.setListeners(List.of(new AppStartingListener()));
//        ConfigurableApplicationContext context = application.run(args);
//
//        Foo foo = context.getBean(Foo.class);
//    }
}

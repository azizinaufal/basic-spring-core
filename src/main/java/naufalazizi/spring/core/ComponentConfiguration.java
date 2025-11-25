package naufalazizi.spring.core;

import naufalazizi.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "naufalazizi.spring.core.service",
        "naufalazizi.spring.core.repository",
        "naufalazizi.spring.core.configuration",
})

@Import(MultiFoo.class)
public class ComponentConfiguration {

}

package naufalazizi.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "naufalazizi.spring.core.configuration"
})
public class ScanConfiguration {
}

package naufalazizi.spring.core;

import naufalazizi.spring.core.service.MerchanServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MerchanServiceImpl.class})
public class InheritanceConfiguration {
}

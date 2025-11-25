package naufalazizi.spring.core.service;

import lombok.Getter;
import naufalazizi.spring.core.repository.ProductRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
//@Lazy
@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
}

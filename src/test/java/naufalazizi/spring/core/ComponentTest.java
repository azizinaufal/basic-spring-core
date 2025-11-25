package naufalazizi.spring.core;

import naufalazizi.spring.core.data.MultiFoo;
import naufalazizi.spring.core.repository.CategoryRespository;
import naufalazizi.spring.core.repository.CustomerRepository;
import naufalazizi.spring.core.repository.ProductRepository;
import naufalazizi.spring.core.service.CategoryService;
import naufalazizi.spring.core.service.CustomerService;
import naufalazizi.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ApplicationContext context;
    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    public void testService(){
        ProductService productService = context.getBean(ProductService.class);
        ProductService productService1 = context.getBean("productService", ProductService.class);

        Assertions.assertSame(productService,productService1);
    }

    @Test
    void testConstructorDependencyInjection(){
        ProductService productService = context.getBean(ProductService.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository,productService.getProductRepository());
    }

    @Test
    void testSetterDependencyInjection(){
        CategoryService categoryService = context.getBean(CategoryService.class);
        CategoryRespository categoryRespository = context.getBean(CategoryRespository.class);

        Assertions.assertSame(categoryRespository,categoryService.getCategoryRespository());
    }

    @Test
    void testFieldDependencyInjection(){
        CustomerService customerService = context.getBean(CustomerService.class);
        CustomerRepository normalCustomerRepository = context.getBean("normalCustomerRepository",CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = context.getBean("premiumCustomerRepository",CustomerRepository.class);

        Assertions.assertSame(customerService.getNormalCustomerRepository(), normalCustomerRepository);
        Assertions.assertSame(customerService.getPremiumCustomerRepository(),premiumCustomerRepository);
    }

    @Test
    void testObjectProvide(){
        MultiFoo multiFoo = context.getBean(MultiFoo.class);

        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }

}

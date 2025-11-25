package naufalazizi.spring.core.service;

import lombok.Getter;
import naufalazizi.spring.core.repository.CategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryService {

    @Getter
    private CategoryRespository categoryRespository;

    @Autowired
    public void setCategoryRespository(CategoryRespository categoryRespository){
        this.categoryRespository=categoryRespository;
    }
}

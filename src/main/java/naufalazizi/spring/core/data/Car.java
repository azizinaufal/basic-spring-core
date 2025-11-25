package naufalazizi.spring.core.data;

import lombok.Getter;
import naufalazizi.spring.core.aware.IdAware;
import org.springframework.stereotype.Component;

@Component
public class Car implements IdAware {

    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id=id;
    }
}

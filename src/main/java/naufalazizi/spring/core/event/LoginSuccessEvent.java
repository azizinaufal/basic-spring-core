package naufalazizi.spring.core.event;

import lombok.Getter;
import naufalazizi.spring.core.data.User;
import org.springframework.context.ApplicationEvent;

public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;

    public LoginSuccessEvent(User user){
        super(user);
        this.user=user;
    }
}

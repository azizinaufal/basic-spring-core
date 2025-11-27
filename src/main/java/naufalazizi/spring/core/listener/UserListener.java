package naufalazizi.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import naufalazizi.spring.core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event){
        log.info("Success Login again for User {}", event.getUser());
    }
}

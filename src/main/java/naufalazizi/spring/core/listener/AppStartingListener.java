package naufalazizi.spring.core.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class AppStartingListener implements ApplicationListener<ApplicationStartedEvent> {
    private static final Logger log = LoggerFactory.getLogger(AppStartingListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("Application Starting");
    }
}

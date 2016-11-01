package zyk.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TryApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
            new ClassPathXmlApplicationContext("Beans.xml");

        CustomEventPublisher cvp =
            (CustomEventPublisher) context.getBean("customEventPublisher");

        cvp.publish();
        cvp.publish();

    }

}

package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext cac = new SpringApplicationBuilder(DemoApplication.class).web(true).run(args);
        Test t = cac.getBean(Test.class);
        t.t();
    }
}

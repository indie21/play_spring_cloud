package zyk.spring;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class TryApplication {

// 	public static void main(String[] args) {
//       SpringApplication.run(TryApplication.class, args);
// 	}
// }


import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class TryApplication {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        // System.out.printf("object message %s\n", obj.getMessage());

        // XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        // HelloWorld obj = (HelloWorld)factory.getBean("helloWorld");
        // obj.getMessage();

        // XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        // HelloWorld obj1 = (HelloWorld)factory.getBean("helloWorld");
        // obj1.getMessage();

        // obj1.setMessage("good");

        // HelloWorld obj2 = (HelloWorld)factory.getBean("helloWorld");
        // obj2.getMessage();

        // obj2.setMessage("nice");

        // obj1.getMessage();
        // obj2.getMessage();

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
        obj.getMessage();

        context.registerShutdownHook();

        HelloIndia obj1 = (HelloIndia)context.getBean("helloIndia");
        obj1.getMessage();

    }
}

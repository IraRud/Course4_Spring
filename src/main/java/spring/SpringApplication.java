package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.model.Bus;
import spring.model.Driver;

public class SpringApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Driver driver1 = context.getBean("John Wick", Driver.class);
        System.out.println(driver1);
        driver1.startMove();
        Bus bus = context.getBean("bus", Bus.class);
        Driver driver2 = context.getBean("Neo", Driver.class);
        System.out.println(driver2);
        Driver driver3 = context.getBean("Dominic Toretto", Driver.class);
        System.out.println(driver3);

        context.close();
    }

}

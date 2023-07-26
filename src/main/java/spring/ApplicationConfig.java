package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring.model.*;

@Configuration
public class ApplicationConfig {

    @Bean
    @Primary
    public Transport bus() {
        return new Bus(Capacity.SMALL);
    }

    @Bean
    public Transport car() {
        return new Car(BodyType.VAN);
    }

    @Bean
    public Transport truck() {
        return new Truck();
    }

    @Bean(name = "John Wick")
    public Driver driver1() {
        return new Driver("John Wick", bus());
    }

    @Bean(name = "Neo")
    public Driver driver2() {
        return new Driver("Neo", truck());
    }

    @Bean(name = "Dominic Toretto")
    public Driver driver3() {
        return new Driver("Dominic Toretto", car());
    }

}

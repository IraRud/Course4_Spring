package spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class Car extends Transport{

    private BodyType bodyType;

    @Override
    public void start() {
        System.out.println("Let's go, Car!");
    }

    @PostConstruct
    public void init() {
        System.out.println("Car is ready to work!");
    }

}

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
public class Truck extends Transport {

    private LoadType loadType;

    @Override
    public void start() {
        System.out.println("Let's go, Pickup!");
    }

    @PostConstruct
    public void init() {
        System.out.println("Truck is ready to work!");
    }

}

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
public class Bus extends Transport {

    private Capacity capacity;

    @Override
    public void start() {
        System.out.println("Let's go, Bus!");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bus is ready to work!");
    }

}

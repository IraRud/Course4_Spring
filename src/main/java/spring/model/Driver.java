package spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Driver {

    private String name;
    private final Transport transport;

    public void startMove() {
        System.out.println(name + " drive the " + transport);
        transport.start();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }

}

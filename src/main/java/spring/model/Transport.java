package spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Transport {

    private String brand;
    private String model;

    public Transport(String brand, String model) {
        this.brand = validateTransportParameters(brand);
        this.model = validateTransportParameters(model);
    }

    public static String validateTransportParameters(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "default" : value;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public abstract void start();
}

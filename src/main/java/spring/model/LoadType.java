package spring.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum LoadType {   // перечисление по типу грузоподъемности для грузовиков (Truck)

    N1(null, 3.5f),     // с полной массой до 3,5 тонн
    N2(3.5f, 12.0f),    // с полной массой свыше 3,5 до 12 тонн
    N3(12.0f, null);    // с полной массой свыше 12 тонн

    private final Float lowWeight;  // нижняя граница
    private final Float highWeight; // верхняя граница

    @Override
    public String toString() {
        return (lowWeight == null) ? "Грузоподъемность до " + highWeight + " тонн"
                : "Грузоподъемность от " + lowWeight + " тонн " + ((highWeight == null) ? ""
                : "до " + highWeight + " тонн");
    }

}
package spring.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Capacity {   // перечисление по типу вместимости для автобусов (Bus)

    VERY_SMALL(0, 10),  // особо малая (до 10 мест)
    SMALL(0, 25),   // малая (до 25)
    AVERAGE(40, 50),    // средняя (25–50)
    BIG(60, 80),    // большая (50–80)
    VERY_BIG(100, 120); // особо большая (80–120 мест)

    private final Integer lowCapacity;  // нижняя граница
    private final Integer highCapacity; // верхняя граница

}

package Practicum.Sprint11.Dependecy;

import org.apache.catalina.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCar {
    private final Engine engine;
    private final SeatHeater seatHeater;

    @Autowired
    public MyCar(Engine engine, @Autowired(required = false) SeatHeater seatHeater) {
        this.engine = engine;
        this.seatHeater = seatHeater;
    }

    public void start() {
        engine.start();
        if (seatHeater != null) {
            seatHeater.start();
        }
    }
}

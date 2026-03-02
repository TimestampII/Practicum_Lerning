package Practicum.Sprint11.Dependecy.cyclic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg {
    private  Chicken chicken;

    @Autowired
    public Egg(Chicken chicken) {
        this.chicken = chicken;
    }
}

package Practicum.Sprint11.Dependecy.cyclic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chicken {
    private final Egg egg;

    @Autowired
    public Chicken(Egg egg){
        this.egg = egg;
    }

}

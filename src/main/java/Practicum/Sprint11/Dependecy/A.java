package Practicum.Sprint11.Dependecy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    private final B b;

    @Autowired
    public A(B b) {
        this.b = b;
    }

    public void printName() {
        System.out.println("Это А!");
        b.printName();
    }
}

package Practicum.Sprint11.Dependecy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppMain.class, args);
        A a = context.getBean(A.class);
        a.printName();
    }
}

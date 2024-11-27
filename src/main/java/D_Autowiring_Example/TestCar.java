package D_Autowiring_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("Autowire.xml");
        Car car1 = context.getBean(Car.class);
        car1.drive();

    }
}

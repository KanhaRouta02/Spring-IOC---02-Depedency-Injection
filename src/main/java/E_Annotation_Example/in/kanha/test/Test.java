package E_Annotation_Example.in.kanha.test;

import E_Annotation_Example.in.kanha.component.Engine;
import E_Annotation_Example.in.kanha.component.Robot;
import E_Annotation_Example.in.kanha.config.Car;
import E_Annotation_Example.in.kanha.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Robot bean = context.getBean(Robot.class);
//      context.getBean(Car.class); // prototype
//      bean.start();

    }
}

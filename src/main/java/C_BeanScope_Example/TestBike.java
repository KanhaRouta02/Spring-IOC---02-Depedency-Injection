package C_BeanScope_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("BeanScope.xml");
        // Singleton
/*      WashPoint bean1 = context.getBean(WashPoint.class);
        System.out.println(bean1.hashCode()); // 64133603
        WashPoint bean2 = context.getBean(WashPoint.class);
        System.out.println(bean2.hashCode()); // 64133603
        WashPoint bean3 = context.getBean(WashPoint.class);
        System.out.println(bean3.hashCode()); // 64133603
*/

        // Prototype
        WashPoint bean1 = context.getBean(WashPoint.class);
        System.out.println(bean1.hashCode()); // 630074945
        WashPoint bean2 = context.getBean(WashPoint.class);
        System.out.println(bean2.hashCode()); // 64133603
        WashPoint bean3 = context.getBean(WashPoint.class);
        System.out.println(bean3.hashCode()); // 1436901839
    }
}

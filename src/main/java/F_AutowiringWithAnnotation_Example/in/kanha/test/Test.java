package F_AutowiringWithAnnotation_Example.in.kanha.test;

import F_AutowiringWithAnnotation_Example.in.kanha.config.MyConfig;
import F_AutowiringWithAnnotation_Example.in.kanha.service.ConnectionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        ConnectionService bean = context.getBean(ConnectionService.class);
        bean.createConnection();
    }
}

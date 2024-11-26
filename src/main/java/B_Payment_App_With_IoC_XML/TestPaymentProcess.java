package B_Payment_App_With_IoC_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPaymentProcess {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Bean.xml");
        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.pay(15000.00);
    }
}

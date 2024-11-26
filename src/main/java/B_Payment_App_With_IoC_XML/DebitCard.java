package B_Payment_App_With_IoC_XML;

import A_Payment_App.Ipayment;

public class DebitCard implements Ipayment {
    public DebitCard() {
        System.out.println("DebitCard constructor");
    }
    @Override
    public boolean processPayment(double amount) {
        System.out.println("DebitCard processPayment successful..");
        return true;
    }
}

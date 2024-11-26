package B_Payment_App_With_IoC_XML;

import A_Payment_App.Ipayment;

public class CreditCard implements Ipayment {
    public CreditCard() {
        System.out.println("CreditCard constructor");
    }
    @Override
    public boolean processPayment(double amount) {
        System.out.println("CreditCard processPayment successful..");
        return true;
    }
}

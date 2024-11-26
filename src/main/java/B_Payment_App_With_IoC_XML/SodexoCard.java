package B_Payment_App_With_IoC_XML;

import A_Payment_App.Ipayment;

public class SodexoCard implements Ipayment {
    public SodexoCard() {
        System.out.println("SodexoCard constructor");
    }
    @Override
    public boolean processPayment(double amount) {
        System.out.println("SodexoCard processPayment successful..");
        return true;
    }
}

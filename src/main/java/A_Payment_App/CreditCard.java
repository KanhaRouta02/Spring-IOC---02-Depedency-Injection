package A_Payment_App;

public class CreditCard implements Ipayment{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("CreditCard processPayment successful..");
        return true;
    }
}

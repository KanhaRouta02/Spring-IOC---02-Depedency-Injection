package A_Payment_App;

public class SodexoCard implements  Ipayment{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("SodexoCard processPayment successful..");
        return true;
    }
}

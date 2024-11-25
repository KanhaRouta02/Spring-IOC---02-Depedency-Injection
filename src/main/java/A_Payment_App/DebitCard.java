package A_Payment_App;

public class DebitCard  implements  Ipayment{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("DebitCard processPayment successful..");
        return true;
    }
}

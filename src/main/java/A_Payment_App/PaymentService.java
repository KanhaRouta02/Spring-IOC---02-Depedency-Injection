package A_Payment_App;

public class PaymentService {
    private Ipayment payment;

    public PaymentService() {

    }
    // Constructor Injection
    public PaymentService(Ipayment payment) {
        this.payment = payment;
    }
    // Setter Injection
    public void doPayment(Ipayment payment) {
        this.payment = payment;
    }
    public void pay(Double amount) {
        boolean status = payment.processPayment(amount);
        if (status) {
            System.out.println("Printing Recipt...");
        }else {
            System.out.println("Payment failed!");
        }
    }
}

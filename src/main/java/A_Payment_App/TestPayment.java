package A_Payment_App;

public class TestPayment {
    public static void main(String[] args) {
        // Constructor Injection
        PaymentService service = new PaymentService(new CreditCard());
        service.pay(2550.00);

        // Setter Injection
        PaymentService service1 = new PaymentService();
        service1.doPayment(new DebitCard());
        service1.pay(5000.00);

        // Both Setter and Constructor Injection at same time
        Ipayment creditCard = new CreditCard();
        Ipayment sodexoCard = new SodexoCard();

        PaymentService ps = new PaymentService(creditCard);
        ps.doPayment(sodexoCard);
        ps.pay(1000.00);
    }
}

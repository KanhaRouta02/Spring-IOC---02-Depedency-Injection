package B_Payment_App_With_IoC_XML;

import A_Payment_App.Ipayment;

public class PaymentService {
    private Ipayment payment;
    public PaymentService() {

    }
//  Constructor Injection
    public PaymentService(Ipayment payment) {
        this.payment = payment;
    }
    // Setter Injection
    public void setPayment(Ipayment payment) {
        this.payment =  payment;
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

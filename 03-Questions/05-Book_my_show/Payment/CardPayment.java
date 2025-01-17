package Payment;

public class CardPayment implements PaymentStrategy{
    private PaymentStatus status;

    public CardPayment(){
        this.status = PaymentStatus.PENDING;
    }

    public PaymentStatus getStatus(){
        return status;
    }

    public void setStatus(PaymentStatus status){
        this.status = status;
    }

    public void doPayment(int amount){
        System.out.println("Payment successfull..");
        setStatus(PaymentStatus.COMPLETED);
    }

    public void refundPayment(int amount){
        System.out.println("Payment Refunded..");
        setStatus(PaymentStatus.REFUNDED);
    }
}

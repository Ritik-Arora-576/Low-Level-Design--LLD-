package Payment;

public class UPIPayment implements PaymentStrategy{
    private PaymentStatus status;

    public UPIPayment(){
        this.status = PaymentStatus.PENDING;
    }

    public PaymentStatus getStatus(){
        return status;
    }

    public void setStatus(PaymentStatus status){
        this.status = status;
    }

    public void doPayment(){
        System.out.println("Payment successfull..");
        setStatus(PaymentStatus.COMPLETED);
    }

    public void refundPayment(){
        System.out.println("Payment Refunded..");
        setStatus(PaymentStatus.REFUNDED);
    }
}

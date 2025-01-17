package Payment;

public interface PaymentStrategy {
    public void doPayment(int amount);
    public void refundPayment(int amount);
    public PaymentStatus getStatus();
    public void setStatus(PaymentStatus status);
}

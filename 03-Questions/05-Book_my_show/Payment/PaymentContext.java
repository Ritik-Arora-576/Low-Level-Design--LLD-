package Payment;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void doPayment(){
        strategy.doPayment();
    }

    public void refundPayment(){
        strategy.refundPayment();
    }
}

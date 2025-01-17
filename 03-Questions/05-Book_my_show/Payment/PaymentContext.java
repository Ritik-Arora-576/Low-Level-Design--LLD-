package Payment;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void doPayment(int amount){
        strategy.doPayment(amount);
    }

    public void refundPayment(int amount){
        strategy.refundPayment(amount);
    }

    public PaymentStatus getStatus(){
        return strategy.getStatus();
    }

    public void setStatus(PaymentStatus status){
        strategy.setStatus(status);
    }
}

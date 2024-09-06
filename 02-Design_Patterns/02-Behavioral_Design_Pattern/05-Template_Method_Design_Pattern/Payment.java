public abstract class Payment{
    // these are the steps whose logic will be define in sub-classes
    public abstract void initiatePayment();
    public abstract void debitPayment();
    public abstract void deductPlatformFees();
    public abstract void creditPayment();

    // steps to be followed in a fixed manner in order to make payment
    // Final methods can't be overriden by sub-classes
    public final void makePayment(){
        initiatePayment(); // step-1
        debitPayment(); // step-2
        deductPlatformFees(); // step-3
        creditPayment(); // step-4
    }
}
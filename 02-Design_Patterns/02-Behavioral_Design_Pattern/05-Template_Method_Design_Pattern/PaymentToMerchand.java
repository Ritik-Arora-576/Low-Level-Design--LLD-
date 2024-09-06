public class PaymentToMerchand extends Payment {
    @Override
    public void initiatePayment(){
        System.out.println("Payment has been initiated towards a merchand");
    }

    @Override
    public void debitPayment(){
        System.out.println("Payment has been debited from your bank account");
    }

    @Override
    public void deductPlatformFees(){
        System.out.println("2% platform fees has been deducted");
    }

    @Override
    public void creditPayment(){
        System.out.println("98% payment has been credited to merchand");
    }
}

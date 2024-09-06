public class PaymentToFriend extends Payment {
    @Override
    public void initiatePayment(){
        System.out.println("Payment has been initiated towards your friend");
    }

    @Override
    public void debitPayment(){
        System.out.println("Payment has been debited from your bank account");
    }

    @Override
    public void deductPlatformFees(){
        System.out.println("There is no platform fee");
    }

    @Override
    public void creditPayment(){
        System.out.println("Payment has been credited to your friend");
    }
}

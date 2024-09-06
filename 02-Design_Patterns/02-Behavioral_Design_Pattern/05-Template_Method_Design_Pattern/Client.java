public class Client {
    public static void main(String[] args) {
        Payment payment1 = new PaymentToFriend();
        payment1.makePayment();

        Payment payment2 = new PaymentToMerchand();
        payment2.makePayment();
    }
}

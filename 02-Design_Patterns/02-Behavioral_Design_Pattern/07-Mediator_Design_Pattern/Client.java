public class Client {
    public static void main(String[] args) {
        // create an auction
        Mediator auction = new AuctionMediator(1000);

        // create bidders
        Member bidder1 = new Bider("Ritik", auction);
        Member bidder2 = new Bider("Yash", auction);
        Member bidder3 = new Bider("Akshay", auction);

        // placing bid
        bidder1.placeBid(1300);
        bidder2.placeBid(1500);
        bidder3.placeBid(1800);
        bidder2.placeBid(500);
    }
}

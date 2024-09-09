public class Bider implements Member {
    private String name;
    private Mediator auction;

    public Bider(String name, Mediator auction){
        this.name = name;
        this.auction = auction;
        // automatically adds member into auction
        auction.addBider(this);
    }

    public String getName(){
        return this.name;
    }

    public void placeBid(int amount){
        auction.placeBid(this, amount);
    }

    public void receiveNotification(Member member, int amount){
        System.out.println("Notification to "+ this.getName() +": "+member.getName()+" has placed a bid of an amount $"+amount);
    }
}

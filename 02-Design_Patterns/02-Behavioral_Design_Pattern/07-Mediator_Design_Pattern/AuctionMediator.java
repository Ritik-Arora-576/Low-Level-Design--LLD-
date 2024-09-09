import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator{
    private List<Member> members;
    private int MIN_BID;

    public AuctionMediator(int minimum_bid_amount){
        this.members = new ArrayList<>();
        this.MIN_BID = minimum_bid_amount;
    }

    public void addBider(Member member){
        this.members.add(member);
    }

    public void placeBid(Member bidder_member, int amount){
        /* if bid amount is less than minimum value then we don't place bid 
        otherwise we would send notifications to other bidders */
        if(amount<=MIN_BID){
            System.out.println(bidder_member.getName()+" should place bid with amount more than $"+this.MIN_BID);
        } else{
            for(Member member:members){
                if(!(member.getName().equals(bidder_member.getName()))){
                    MIN_BID = amount;
                    member.receiveNotification(bidder_member, amount);
                }
            }
        }
    }
}

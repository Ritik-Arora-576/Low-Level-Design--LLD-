package Observer;
import Observable.StocksObservable;

public class MobileObserver implements Observer{
    private StocksObservable stocksObservable;
    private String username;

    public MobileObserver(String username, StocksObservable stocksObservable){
        this.stocksObservable = stocksObservable;
        this.username = username;
        this.stocksObservable.add(this);
    }

    public void update(){
        System.out.println("Notification to "+this.username+": New stocks of "+stocksObservable.getProductName()+" are out now !!!");
    }
}

package Observer;
import Observable.StocksObservable;

public class EmailObserver implements Observer{
    private StocksObservable stocksObservable;
    private String emailID;

    public EmailObserver(String emailID, StocksObservable stocksObservable){
        this.stocksObservable = stocksObservable;
        this.emailID = emailID;
        this.stocksObservable.add(this);
    }

    public void update(){
        System.out.println("Email to "+this.emailID+": New stocks of "+stocksObservable.getProductName()+" are out now !!!");
    }
}

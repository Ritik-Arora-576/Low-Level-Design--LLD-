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
        if(stocksObservable.getStocks()==0){
            System.out.println("Notification to "+this.emailID+": All stocks of "+stocksObservable.getProductName()+" are finished :( !!!");
        } else{
            System.out.println("Notification to "+this.emailID+": Current stocks of "+stocksObservable.getProductName()+" are "+stocksObservable.getStocks());
        }
    }
}

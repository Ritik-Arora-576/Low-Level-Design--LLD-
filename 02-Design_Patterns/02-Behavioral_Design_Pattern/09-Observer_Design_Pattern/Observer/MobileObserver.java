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
        if(stocksObservable.getStocks()==0){
            System.out.println("Notification to "+this.username+": All stocks of "+stocksObservable.getProductName()+" are finished :( !!!");
        } else{
            System.out.println("Notification to "+this.username+": Current stocks of "+stocksObservable.getProductName()+" are "+stocksObservable.getStocks());
        }
    }
}

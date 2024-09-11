package Observable;
import java.util.ArrayList;
import java.util.List;
import Observer.Observer;

public class SamsungWatchStocks implements StocksObservable{
    private List<Observer> observers = new ArrayList<>();
    private int stocks = 0;

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void setStocks(int stocks){
        // whenever we're adding new stocks then we will notify the observers
        if(this.stocks==0){
            this.notifyObservers();
        }
        this.stocks = stocks;
    }

    public int getStocks(){
        return this.stocks;
    }

    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update();
        }
    }

    public String getProductName(){
        return "Samsung Smart Watch";
    }
}

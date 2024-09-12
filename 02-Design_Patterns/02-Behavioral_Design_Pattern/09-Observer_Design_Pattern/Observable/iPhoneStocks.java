package Observable;
import java.util.ArrayList;
import java.util.List;
import Observer.Observer;

public class iPhoneStocks implements StocksObservable{
    private List<Observer> observers = new ArrayList<>();
    private int stocks = 0;

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void setStocks(int stocks){
        // whenever we are changing the state of observable it will notify to all the associated observers
        this.stocks = stocks;
        this.notifyObservers();
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
        return "iPhone";
    }
}

package Observable;
import Observer.Observer;

public interface StocksObservable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    void setStocks(int stocks);
    int getStocks();
    String getProductName();
}
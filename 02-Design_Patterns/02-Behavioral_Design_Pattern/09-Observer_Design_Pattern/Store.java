import Observer.*;
import Observable.*;

public class Store {
    public static void main(String[] args) {
        // creating the objects of observable
        StocksObservable iPhone = new iPhoneStocks();
        StocksObservable samsungSmartWatch = new SamsungWatchStocks();
        
        // creating the objects of observer
        Observer observer1 = new EmailObserver("ritik656@gmail.com", iPhone);
        Observer observer2 = new MobileObserver("yash153", samsungSmartWatch);
        Observer observer3 = new MobileObserver("akshay564", iPhone);
        Observer observer4 = new EmailObserver("anchal123@gmail.com", samsungSmartWatch);

        // set stocks and notify related observers
        iPhone.setStocks(10);
        samsungSmartWatch.setStocks(34);
        iPhone.setStocks(0);
        iPhone.setStocks(17);
        samsungSmartWatch.setStocks(0);
        samsungSmartWatch.setStocks(13);
    }
}

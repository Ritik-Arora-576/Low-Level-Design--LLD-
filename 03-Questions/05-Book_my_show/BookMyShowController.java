import Payment.PaymentContext;

public class BookMyShowController {
    private static BookMyShowController instance;
    public PaymentContext payment;

    private BookMyShowController(){
        if(instance!=null){
            System.out.println("Instance has already been created");
        }
    }

    public static synchronized BookMyShowController getInstance(){
        if(instance==null){
            instance = new BookMyShowController();
        }
        return instance;
    }
}

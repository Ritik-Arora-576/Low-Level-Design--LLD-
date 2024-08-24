package Example_2;

public class InvoiceDAO {
    private Invoice invoice;

    public InvoiceDAO(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        System.out.println("Saving invoice to database");
        // mention hibernate code
    }
}

package Example_1;

public class InvoiceDAO {
    Invoice invoice;

    public InvoiceDAO(Invoice invoice){
        this.invoice = invoice;
    }

    // this function save invoice to database
    public void saveToDB(){
        // define a logic
        System.out.println("Invoice save to database");
    }

    // MODIFICATION: this function save invoice to local storage
    public void saveToLocal(){
        // define a logic
        System.out.println("Invoice save to local storage.");
    }
}

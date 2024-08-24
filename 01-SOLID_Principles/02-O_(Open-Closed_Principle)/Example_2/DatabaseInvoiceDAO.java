package Example_2;

// this class save Invoice to database
public class DatabaseInvoiceDAO implements InvoiceDAO {
    public void save(Invoice invoice){
        System.out.println("Data has been stored into database.");
    }
}

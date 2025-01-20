import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        Product decorated_product = new GeneralCoupon(new TypeCoupon(product, 3),10);
        products.add(decorated_product);
    }

    public void getInvoice(){
        double total_price = 0;

        for(int i=0;i<products.size();i++){
            System.out.println(products.get(i).getName()+"->"+products.get(i).getPrice());
            total_price+=products.get(i).getPrice();
        }

        System.out.println("Total Bill -> "+total_price);
    }
}

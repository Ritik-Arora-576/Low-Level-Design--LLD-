import java.util.ArrayList;
import java.util.List;

public class TypeCoupon extends CouponDecorator{
    private double percentage;
    private static List<ProductType> elegiableTypes = new ArrayList<>();

    static{
        elegiableTypes.add(ProductType.ELECTRONICS);
        elegiableTypes.add(ProductType.FURNITURE);
    }

    public TypeCoupon(Product product, double percentage){
        super(product);
        this.percentage = percentage;
    }

    @Override
    public double getPrice(){
        if(elegiableTypes.contains(product.getType())){
            return product.getPrice()*(1-(percentage/100));
        }
        return product.getPrice();
    }
}

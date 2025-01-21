public class CouponDecorator extends Product{
    protected Product product;

    public CouponDecorator(Product product){
        this.product = product;
    }

    @Override
    public String getName(){
        return product.getName();
    }
}

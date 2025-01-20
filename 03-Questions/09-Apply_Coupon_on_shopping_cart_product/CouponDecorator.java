public class CouponDecorator extends Product{
    protected Product product;

    public CouponDecorator(Product product){
        this.product = product;
    }
}

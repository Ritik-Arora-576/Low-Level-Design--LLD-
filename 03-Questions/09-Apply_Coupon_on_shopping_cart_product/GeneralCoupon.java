public class GeneralCoupon extends CouponDecorator{
    private double percentage;

    public GeneralCoupon(Product product, double percentage){
        super(product);
        this.percentage = percentage;
    }

    @Override
    public double getPrice(){
        return product.getPrice()*(1-(percentage/100));
    }
}

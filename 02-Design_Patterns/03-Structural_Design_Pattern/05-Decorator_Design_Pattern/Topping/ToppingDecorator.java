package Topping;
import Pizza.BasePizza;

public abstract class ToppingDecorator extends BasePizza{
    protected BasePizza basePizza;

    public ToppingDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }
}

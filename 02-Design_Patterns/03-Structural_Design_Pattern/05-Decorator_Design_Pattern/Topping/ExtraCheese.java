package Topping;
import Pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    public ExtraCheese(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public int cost(){
        return basePizza.cost() + 20;
    }
}

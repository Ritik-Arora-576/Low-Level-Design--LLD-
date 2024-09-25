package Topping;
import Pizza.BasePizza;

public class Corns extends ToppingDecorator{
    public Corns(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public int cost(){
        return basePizza.cost() + 5;
    }
}

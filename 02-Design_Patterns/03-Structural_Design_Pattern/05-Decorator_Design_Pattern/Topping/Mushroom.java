package Topping;
import Pizza.BasePizza;

public class Mushroom extends ToppingDecorator{
    public Mushroom(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public int cost(){
        return basePizza.cost() + 10;
    }
}

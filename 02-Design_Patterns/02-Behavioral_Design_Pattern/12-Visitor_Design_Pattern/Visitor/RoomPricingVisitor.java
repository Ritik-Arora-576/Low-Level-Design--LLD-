package Visitor;
import Elements.*;

public class RoomPricingVisitor implements RoomVisitor{
    public void visit(SingleRoom room){
        room.price = 1000;
        System.out.println("Cost of Single Room is "+room.price);
    }

    public void visit(DoubleRoom room){
        room.price = 2000;
        System.out.println("Cost of Double Room is "+room.price);
    }

    public void visit(DeluxeRoom room){
        room.price = 3500;
        System.out.println("Cost of Deluxe Room is "+room.price);
    }
}

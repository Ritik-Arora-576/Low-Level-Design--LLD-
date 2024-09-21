package Visitor;
import Elements.DeluxeRoom;
import Elements.DoubleRoom;
import Elements.SingleRoom;

public class RoomMantainenceVisitor implements RoomVisitor{
    public void visit(SingleRoom room){
        System.out.println("Single Room is under mantainence");
    }

    public void visit(DoubleRoom room){
        System.out.println("Double Room is under mantainence");
    }

    public void visit(DeluxeRoom room){
        System.out.println("Deluxe Room is under mantainence");
    }
}

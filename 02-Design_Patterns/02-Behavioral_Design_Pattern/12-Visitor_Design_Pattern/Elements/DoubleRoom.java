package Elements;
import Visitor.RoomVisitor;

public class DoubleRoom implements RoomElement{
    public int price;

    public void accept(RoomVisitor visitor){
        visitor.visit(this);
    }
}

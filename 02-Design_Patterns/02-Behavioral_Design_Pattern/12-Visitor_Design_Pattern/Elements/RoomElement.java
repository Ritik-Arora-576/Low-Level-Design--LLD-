package Elements;
import Visitor.RoomVisitor;

public interface RoomElement{
    void accept(RoomVisitor visitor);
}
import Elements.*;
import Visitor.*;

public class Client {
    public static void main(String[] args) {
        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        DeluxeRoom deluxeRoom = new DeluxeRoom();

        RoomVisitor price = new RoomPricingVisitor();

        price.visit(singleRoom);
        price.visit(doubleRoom);
        price.visit(deluxeRoom);

        RoomVisitor mantainence = new RoomMantainenceVisitor();

        mantainence.visit(singleRoom);
        mantainence.visit(doubleRoom);
        mantainence.visit(deluxeRoom);
    }
}

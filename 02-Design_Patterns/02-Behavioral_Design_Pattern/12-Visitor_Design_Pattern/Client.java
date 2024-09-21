import Elements.*;
import Visitor.*;

public class Client {
    public static void main(String[] args) {
        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        DeluxeRoom deluxeRoom = new DeluxeRoom();

        RoomVisitor price = new RoomPricingVisitor();

        singleRoom.accept(price);
        doubleRoom.accept(price);
        deluxeRoom.accept(price);

        RoomVisitor mantainence = new RoomMantainenceVisitor();

        singleRoom.accept(mantainence);
        doubleRoom.accept(mantainence);
        deluxeRoom.accept(mantainence);
    }
}

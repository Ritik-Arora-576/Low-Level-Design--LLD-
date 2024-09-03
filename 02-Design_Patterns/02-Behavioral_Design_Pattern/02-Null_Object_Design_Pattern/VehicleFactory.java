import Vehicle_module.*;

public class VehicleFactory {
    public static Vehicle getVehicle(String str){
        if(str=="Car") return new Car();
        else if(str=="Bike") return new Bike();
        return new NullVehicle();
    }
}

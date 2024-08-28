import Factory_module.VehicleFactory;

public class AbstractVehicleFactory {
    public static VehicleFactory getVehicles(VehicleFactory vehicleFactory){
        return vehicleFactory;
    }
}

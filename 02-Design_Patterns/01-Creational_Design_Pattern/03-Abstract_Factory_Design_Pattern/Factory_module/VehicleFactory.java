package Factory_module;

import Bike_module.Bike;
import Car_module.Car;

public interface VehicleFactory {
    Car getCar();
    Bike getBike();
}

package Factory_module;

import Car_module.Car;
import Car_module.ToyotaCar;
import Bike_module.Bike;
import Bike_module.ToyotaBike;

public class ToyotaFactory implements VehicleFactory{
    public Car getCar(){
        return new ToyotaCar();
    }

    public Bike getBike(){
        return new ToyotaBike();
    }
}

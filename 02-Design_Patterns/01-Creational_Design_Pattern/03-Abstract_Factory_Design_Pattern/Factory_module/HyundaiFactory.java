package Factory_module;

import Car_module.Car;
import Car_module.HyundaiCar;
import Bike_module.Bike;
import Bike_module.HyundaiBike;

public class HyundaiFactory implements VehicleFactory{
    public Car getCar(){
        return new HyundaiCar();
    }

    public Bike getBike(){
        return new HyundaiBike();
    }
}

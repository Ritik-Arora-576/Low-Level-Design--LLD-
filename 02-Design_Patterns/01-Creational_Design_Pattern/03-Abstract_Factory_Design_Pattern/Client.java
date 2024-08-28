import Factory_module.*;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vehicle1 = AbstractVehicleFactory.getVehicles(new HyundaiFactory());
        System.out.println("Price of Hyundai Car: "+vehicle1.getCar().getPrice());
        System.out.println("Price of Hyundai Bike: "+vehicle1.getBike().getPrice());

        VehicleFactory vehicle2 = AbstractVehicleFactory.getVehicles(new ToyotaFactory());
        System.out.println("Price of Toyota Car: "+vehicle2.getCar().getPrice());
        System.out.println("Price of Toyota Bike: "+vehicle2.getBike().getPrice());
    }
}

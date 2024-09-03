import Vehicle_module.Vehicle;

public class Client {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicle("Car");
        Vehicle v2 = VehicleFactory.getVehicle("Bike");
        Vehicle v3 = VehicleFactory.getVehicle("Truck"); // non-existing object
        Vehicle v4 = VehicleFactory.getVehicle(null); // pass null

        // printing vehicle
        printVehicle(v1);
        printVehicle(v2);
        printVehicle(v3);
        printVehicle(v4);
    }

    private static void printVehicle(Vehicle vehicle){
        // handling null pointer exception explicitly
        // if(vehicle!=null){
        //     System.out.println("Total Seats: "+vehicle.getSeatsCount());
        //     System.out.println("Fuel Capacity: "+vehicle.getFuelCapacity());
        // }

        // handling automatically by Null Object without defining any condition
        System.out.println("Total Seats: "+vehicle.getSeatsCount());
        System.out.println("Fuel Capacity: "+vehicle.getFuelCapacity());
    }
}

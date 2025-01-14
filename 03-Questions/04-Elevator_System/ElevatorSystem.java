public class ElevatorSystem {
    public static void main(String[] args) {
        ElevatorController system = new ElevatorController(3,5);

        system.requestElevator(3, 5);
        system.requestElevator(4, 1);
        system.requestElevator(3, 9);
        system.requestElevator(6, 2);
    }
}

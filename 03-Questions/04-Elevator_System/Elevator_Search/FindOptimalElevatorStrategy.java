package Elevator_Search;
import java.util.List;

public interface FindOptimalElevatorStrategy {
    public Elevator searchElevator(Request request, List<Elevator> elevators);
}
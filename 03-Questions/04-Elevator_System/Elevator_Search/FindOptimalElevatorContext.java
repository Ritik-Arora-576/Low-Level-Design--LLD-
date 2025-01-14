package Elevator_Search;
import java.util.List;

public class FindOptimalElevatorContext {
    FindOptimalElevatorStrategy strategy;

    public FindOptimalElevatorContext(FindOptimalElevatorStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(FindOptimalElevatorStrategy strategy){
        this.strategy = strategy;
    }

    public Elevator findElevator(Request request, List<Elevator> elevators){
        return strategy.searchElevator(request, elevators);
    }
}

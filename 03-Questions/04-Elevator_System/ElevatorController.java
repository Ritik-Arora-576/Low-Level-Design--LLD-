import java.util.ArrayList;
import java.util.List;
import Elevator_Search.*;

public class ElevatorController {
    private List<Elevator> elevators;
    private FindOptimalElevatorContext obj;

    public ElevatorController(int n_elevators, int capacity){
        this.elevators = new ArrayList<>();
        for(int i=0;i<n_elevators;i++){
            Elevator elevator = new Elevator(i+1, capacity);
            this.elevators.add(elevator);
        }
        this.obj = new FindOptimalElevatorContext(new NearestElevator());
    }

    public void requestElevator(int src_floor, int dst_floor){
        Request request = new Request(src_floor, dst_floor);
        Elevator elevator = this.obj.findElevator(request, elevators);
        elevator.addRequest(request);
    }

    public void setSearchStrategy(FindOptimalElevatorStrategy strategy){
        this.obj.setStrategy(strategy);
    }
}

package Elevator_Search;
import java.util.List;

public class NearestElevator implements FindOptimalElevatorStrategy{
    public NearestElevator(){}

    public Elevator searchElevator(Request request, List<Elevator> elevators){
        Elevator elevator = null;
        int distance = Integer.MAX_VALUE;

        for(int i=0;i<elevators.size();i++){
            int curr_floor = elevator.curr_floor;
            int dst_floor = request.getDst_floor();

            if(Math.abs(curr_floor-dst_floor)<distance){
                distance = Math.abs(curr_floor-dst_floor);
                elevator = elevators.get(0);
            }
        }

        return elevator;
    }
}

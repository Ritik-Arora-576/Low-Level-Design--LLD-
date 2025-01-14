import java.util.ArrayList;
import java.util.List;

public class Elevator {
    public int id;
    public Direction direction;
    public List<Request> requests;
    public int capacity;
    public int curr_floor;

    public Elevator(int id, int capacity){
        this.id = id;
        this.direction = Direction.UP;
        this.requests = new ArrayList<>();
        this.capacity = capacity;
        this.curr_floor = 1;
        this.processRequests();
    }

    public synchronized void addRequest(Request request){
        if(requests.size()<capacity){
            this.requests.add(request);
        }
    }

    public synchronized void processRequests(){
        while(true){
            while(this.requests.size()>0){
                Request request = requests.get(0);
                requests.remove(0);
                processRequest(request);
            }
        }
    }

    public void processRequest(Request request){
        System.out.println("Your request has been processed");
    }
}

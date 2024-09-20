import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Momento> momentosList;

    public Caretaker(){
        this.momentosList = new ArrayList<>();
    }

    public void addMomento(Momento momento){
        this.momentosList.add(momento);
    }

    public Momento restoreMomento(int idx){
        return momentosList.get(idx);
    }
}

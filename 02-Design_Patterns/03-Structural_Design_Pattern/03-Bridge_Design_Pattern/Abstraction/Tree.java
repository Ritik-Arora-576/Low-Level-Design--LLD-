package Abstraction;
import Implementer.Breathing;

public class Tree implements Creature{
    public Breathing breathing;

    public Tree(Breathing breathing){
        this.breathing = breathing;
    }

    public void breathe(){
        breathing.breathe();
    }

    public void setBreathing(Breathing breathing) {
        this.breathing = breathing;
    }
}

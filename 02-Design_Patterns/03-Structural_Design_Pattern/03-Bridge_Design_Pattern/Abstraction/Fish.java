package Abstraction;
import Implementer.Breathing;

public class Fish implements Creature{
    public Breathing breathing;

    public Fish(Breathing breathing){
        this.breathing = breathing;
    }

    public void breathe(){
        breathing.breathe();
    }
}

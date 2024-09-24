package Abstraction;
import Implementer.Breathing;

public class Human implements Creature{
    public Breathing breathing;

    public Human(Breathing breathing){
        this.breathing = breathing;
    }

    public void breathe(){
        breathing.breathe();
    }
}

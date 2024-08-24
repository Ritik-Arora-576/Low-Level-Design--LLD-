package Example_2;

public class Cycle implements Vehicle{
    private int speed;

    public Cycle(int speed){
        this.speed = speed;
    }

    public void accelerate(){
        this.speed+=10;
    }
}

package Example_1;

public class Cycle implements Vehicle{
    private int speed;

    public Cycle(int speed){
        this.speed = speed;
    }

    public void turnOnEngine(){
        throw new AssertionError("there is no error");
    }

    public void accelerate(){
        this.speed+=10;
    }
}

package Example_2;

public class Bike implements Vehicle{
    private int speed;

    public Bike(int speed){
        this.speed = speed;
    }

    public void turnOnEngine(){
        System.out.println("Engine Started");
    }

    public void accelerate(){
        this.speed+=10;
    }
}

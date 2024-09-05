package Devices;

public class Television implements Device{
    public void turnOn(){
        System.out.println("Television has been turned on.");
    }

    public void turnOff(){
        System.out.println("Television has been turned off.");
    }

    public void increaseVolume(){
        System.out.println("Television volume has been increased by 10.");
    }

    public void decreaseVolume(){
        System.out.println("Television volume has been decreased by 10.");
    }
}

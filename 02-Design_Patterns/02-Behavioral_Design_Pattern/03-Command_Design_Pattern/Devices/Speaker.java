package Devices;

public class Speaker implements Device{
    public void turnOn(){
        System.out.println("Speaker has been turned on.");
    }

    public void turnOff(){
        System.out.println("Speaker has been turned off.");
    }

    public void increaseVolume(){
        System.out.println("Speaker volume has been increased by 10.");
    }

    public void decreaseVolume(){
        System.out.println("Speaker volume has been decreased by 10.");
    }
}

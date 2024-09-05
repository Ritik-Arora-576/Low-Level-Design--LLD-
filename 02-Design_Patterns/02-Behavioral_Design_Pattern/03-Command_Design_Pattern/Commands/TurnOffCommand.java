package Commands;
import Devices.*;

public class TurnOffCommand implements Command{
    private Device device;

    public TurnOffCommand(Device device){
        this.device = device;
    }

    public void execute(){
        device.turnOff();
    }

    public void undo(){
        device.turnOn();
    }
}

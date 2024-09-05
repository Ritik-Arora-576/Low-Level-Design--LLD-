package Commands;
import Devices.*;

public class TurnOnCommand implements Command{
    private Device device;

    public TurnOnCommand(Device device){
        this.device = device;
    }

    public void execute(){
        device.turnOn();
    }

    public void undo(){
        device.turnOff();
    }
}

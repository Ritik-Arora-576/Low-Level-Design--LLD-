package Commands;
import Devices.*;

public class IncreaseVolumeCommand implements Command{
    private Device device;

    public IncreaseVolumeCommand(Device device){
        this.device = device;
    }

    public void execute(){
        device.increaseVolume();
    }

    public void undo(){
        device.decreaseVolume();
    }
}

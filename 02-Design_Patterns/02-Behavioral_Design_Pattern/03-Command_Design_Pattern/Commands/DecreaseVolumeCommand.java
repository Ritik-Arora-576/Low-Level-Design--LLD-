package Commands;
import Devices.*;

public class DecreaseVolumeCommand implements Command{
    private Device device;

    public DecreaseVolumeCommand(Device device){
        this.device = device;
    }

    public void execute(){
        device.decreaseVolume();
    }

    public void undo(){
        device.increaseVolume();
    }
}

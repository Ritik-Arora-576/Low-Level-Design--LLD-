import Commands.*;
import Devices.*;

public class Client {
    public static void main(String[] args) {
        // create the objects for device
        Device television = new Television();
        Device speaker = new Speaker();

        // create the command objects for television
        Command turnTVOn = new TurnOnCommand(television);
        Command turnTVOff = new TurnOffCommand(television);
        Command increaseTVVolume = new IncreaseVolumeCommand(television);
        Command decreaseTVVolume = new DecreaseVolumeCommand(television);

        // create the command objects for speaker
        Command turnSpeakerOn = new TurnOnCommand(speaker);
        Command turnSpeakerOff = new TurnOffCommand(speaker);
        Command increaseSpeakerVolume = new IncreaseVolumeCommand(speaker);
        Command decreaseSpeakerVolume = new DecreaseVolumeCommand(speaker);

        // create the object for remote controller
        RemoteController controller = new RemoteController();

        // executing and undoing the function without knowing the actual implementation of it
        controller.executeCommand(turnSpeakerOn);
        controller.executeCommand(increaseSpeakerVolume);
        controller.undoCommand();
        controller.undoCommand();

        controller.executeCommand(turnTVOn);
        controller.executeCommand(increaseTVVolume);
        controller.undoCommand();
        controller.undoCommand();
    }
}

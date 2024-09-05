import java.util.ArrayList;
import java.util.List;
import Commands.Command;

public class RemoteController {
    // mantain a queue of commands which will gonna execute or undo
    private List<Command> commands;

    public RemoteController(){
        this.commands = new ArrayList<>();
    }

    public void executeCommand(Command command){
        commands.add(command);
        command.execute();
    }

    public void undoCommand(){
        if(commands.size()!=0){
            Command command = commands.remove(commands.size()-1);
            command.undo();
        }
    }
}

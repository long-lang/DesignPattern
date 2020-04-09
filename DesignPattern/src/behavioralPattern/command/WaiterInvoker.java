package behavioralPattern.command;

import java.util.ArrayList;

public class WaiterInvoker {
    private ArrayList<Command> commands = null;
    public WaiterInvoker(){
        commands = new ArrayList<Command>();
    }

    public void setCommand(Command command){
        commands.add(command);
    }

    public void orderUp(){
        for(Command command:commands){
            command.execute();
        }
    }
}

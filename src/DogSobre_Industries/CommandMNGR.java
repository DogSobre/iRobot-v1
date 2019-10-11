package DogSobre_Industries;

import java.util.ArrayList;
import java.util.List;

public class CommandMNGR {

    private List<Command> list;

    public CommandMNGR(){
        this.list = new ArrayList<>();
    }

    public void addCommand(String n, int d){
        Command cmd = new Command(n, d, System.currentTimeMillis());
        this.list.add( cmd );
    }


}

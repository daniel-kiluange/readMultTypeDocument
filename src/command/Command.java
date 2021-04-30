package command;

import java.io.FileNotFoundException;

public interface Command {

  void execute() throws FileNotFoundException;

}

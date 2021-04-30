package client;

import command.Command;
import command.OpenCommand;
import java.io.IOException;
import java.nio.file.Path;

public class Main {

  public static void main(String[] args) throws IOException {
    Path path = Path.of("src/test.csv");
    Command openCommand = new OpenCommand(path);
    openCommand.execute();
    FileRunner.processFile();
  }

}

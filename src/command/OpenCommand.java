package command;

import client.FileRunner;
import document.BasicDocument;
import document.CSVDocument;
import document.Document;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Optional;

public class OpenCommand implements Command {

  Path path;

  public OpenCommand(Path path) {
    this.path = path;
  }

  @Override
  public void execute() throws FileNotFoundException {
    Document document;

    String extension = Optional.ofNullable(path.toString()).filter(p -> p.contains("."))
        .map(ext -> ext.substring(path.toString().lastIndexOf(".") + 1)).orElseThrow();

    System.out.printf("Opening %s file %n", extension);

    switch (extension) {
      case "csv":
        document = new CSVDocument(path);
        FileRunner.document = document;
        document.open();
        break;
      default:
        document = new BasicDocument(path);
        FileRunner.document = document;
        break;
    }
  }
}

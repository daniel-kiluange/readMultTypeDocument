package client;


import document.BasicDocument;
import document.CSVDocument;
import document.Document;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class FileRunner {

  public static Document document;

  public static void processFile() throws IOException {

    if (document instanceof CSVDocument) {
      readDocument();
    } else if (document instanceof BasicDocument) {
      readDocument();
    }

    document.close();
  }

  private static void readDocument() throws IOException {
    List<String> lines = Files
        .readAllLines(((CSVDocument) document).path, StandardCharsets.UTF_8);
    lines.forEach(System.out::println);
  }

}

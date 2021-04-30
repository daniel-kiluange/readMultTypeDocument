package document;

import java.nio.file.Path;

public class CSVDocument extends BasicDocument {

  public CSVDocument(Path path) {
    super(path);
    this.extension = "csv";
  }
}

package document;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Document {

  void open() throws FileNotFoundException;
  void write() throws IOException;
  void close() throws IOException;

}

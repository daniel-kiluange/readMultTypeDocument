package document;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class BasicDocument implements Document {

  public Path path;
  public String extension;
  public Map<String, String> metadata;

  private FileInputStream fileInputStream;
  private FileOutputStream fileOutputStream;

  public BasicDocument(Path path) {
    this.path = path;
  }

  @Override
  public void open() throws FileNotFoundException {
    this.fileInputStream = new FileInputStream(path.toFile());
  }

  @Override
  public void write() throws IOException {
    this.fileInputStream.close();
    this.fileOutputStream = new FileOutputStream(path.toFile());
  }

  @Override
  public void close() throws IOException {
    if (fileOutputStream != null) {
      fileOutputStream.close();
    }
  }
}

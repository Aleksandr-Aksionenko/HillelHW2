package InputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writeFile(File files, String text) throws IOException {
      try {  FileWriter writer = new FileWriter(files);
        writer.write(text);
        writer.flush();
        }catch (NullPointerException e){

      }
    }
}

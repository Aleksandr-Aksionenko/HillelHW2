package InputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writeFile(File file, String text) {
        try (FileWriter writer = new FileWriter((file))) {
            writer.write(text);
            writer.flush();

        } catch (IOException ioe) {
            System.out.println("IOException");
        }

    }

}

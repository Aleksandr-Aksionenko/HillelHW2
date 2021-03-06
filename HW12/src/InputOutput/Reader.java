package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Reader {
    public static String read() throws IOException {
        String content = null;
        try (FileInputStream fis = new FileInputStream(new File("Cars.txt"))) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);

            content = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}



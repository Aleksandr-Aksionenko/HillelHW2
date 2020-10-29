package webWorkers;

import sun.misc.IOUtils;

import java.io.*;


public class TextWorker {

    public String countWords(String wordGet) throws IOException {
        int counter = 0;
        String text = readFile();
        String[] words = text.split("\\s");
        for (String word : words) {
            if (!word.isEmpty()) {
                if (word.equals(wordGet)) {
                    counter++;
                }
            }
        }
        return "This word  " + counter;
    }

    public String readFile() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("Words.txt");
        try (BufferedInputStream bis = new BufferedInputStream(inputStream);
             ByteArrayOutputStream buf = new ByteArrayOutputStream()) {
            int result = bis.read();
            while (result != -1) {
                buf.write((byte) result);
                result = bis.read();
            }
            return buf.toString();
        }
    }
}

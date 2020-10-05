import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worker {

    private String text;

    public Worker(String text) {
        this.text = text;
    }

    public Map<String, Integer> countWords() {
        int key;
        HashMap<String, Integer> mapWords = new HashMap<>();
        String[] words = text.split("[,. ]");
        for (int i = 0; i < words.length; i++) {
            if (mapWords.containsKey(words[i])) {
                key = mapWords.get(words[i]);

                mapWords.put(words[i], key + 1);
            } else {
                mapWords.put(words[i], 1);
            }
        }
        return mapWords;
    }

    public String replaceSymbol(int index, char symbol) {
        return setText(text.replaceAll(String.format("(\\b\\w{%d})\\w", index - 1), "$1" + symbol));
    }

    public int countSymbol() {
        Matcher m = Pattern.compile("[.,!]").matcher(text);
        int matches = 0;
        while (m.find())
            matches++;
        return matches;
    }

    public String getText() {
        return text;
    }

    public String setText(String text) {
        this.text = text;
        return text;
    }
}

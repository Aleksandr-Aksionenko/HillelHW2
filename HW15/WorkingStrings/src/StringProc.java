import java.util.HashMap;

public class StringProc {
    final String TEXT = "Hash table based implementation of the Map interface interface. " +
            "This implementation provides all of the optional map operations, and permits null values and the null key";
    int key;

    HashMap<String, Integer> mapWords = new HashMap<>();
    String[] words = TEXT.split("[,. ]");

    public void checkText() {
        for (int i = 0; i < words.length; i++) {
            if (mapWords.containsKey(words[i])) {
                key = mapWords.get(words[i]);

                mapWords.put(words[i], key + 1);
            } else {
                mapWords.put(words[i], 1);
            }
        }
        System.out.println(mapWords);
        mapWords.forEach((key, value) -> {
            if (value.equals(1)) {
                System.out.println(key);
            }
        });
    }
}



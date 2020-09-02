package arrayUtils;

public class Utils {
    public static int[] arrayByLength(int[] array, int lengthToAdd) {
        int result[] = new int[array.length + lengthToAdd];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}

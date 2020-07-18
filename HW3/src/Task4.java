public class Task4 {
    public static void main(String[] args) {
        int[] array = {23, 1, 5, 44, 123, 7, 58, 88, 443};
        int tmpMax = array[0];
        int tmpMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (tmpMax < array[i]) {
                tmpMax = array[i];
            }
            if (tmpMin > array[i]) {
                tmpMin = array[i];
            }
        }
        System.out.println("Min: " + tmpMin + "\n" + "Max: " + tmpMax);
    }
}


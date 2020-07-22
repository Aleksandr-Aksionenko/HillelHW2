public class Task2 {
    public static void main(String[] args) {
        int[] array = {123, 2, 43, 123, 141256, 2994, 39021};

        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int tmp = 0;
            int number = array[i];
            while (number != 0) {
                number /= 10;
                tmp++;
                array2[i] = tmp;
            }
        }
        int tmpMax = array2[0];
        int tmpMin = array2[0];
        for (int i = 1; i < array.length; i++) {
            if (tmpMax < array2[i]) {
                tmpMax = array2[i];
            }
            if (tmpMin > array2[i]) {
                tmpMin = array2[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (tmpMax == array2[i])
                System.out.println("long: " + array[i] + ". length = " + tmpMax);
            if (tmpMin == array2[i])
                System.out.println("short: " + array[i] + ". length = " + tmpMin);
        }
    }
}






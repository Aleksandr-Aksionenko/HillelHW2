public class Task2 {
    public static void main(String[] args) {
        int[] array = {2, 20, 3, 13, 12, 4, 7, 11, 137, 17, 20, 22, 61, 52};
        int tmpMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > tmpMax)
                tmpMax = array[i];
        }
        boolean isSimple = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j <= tmpMax; j++) {
                if (array[i] % j == 0 && array[i] != j) {
                    isSimple = false;
                    break;
                } else isSimple = true;
            }
            if (isSimple == true)
                System.out.println(array[i]);
        }
    }
}



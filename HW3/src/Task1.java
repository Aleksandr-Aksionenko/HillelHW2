public class Task1 {
    public static void main(String[] args) {
        int[] array = {21, 33, 1, 5, 123, 22, 67, 88, 2, 4,};
        System.out.println("Четные: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println("Нечетные: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}


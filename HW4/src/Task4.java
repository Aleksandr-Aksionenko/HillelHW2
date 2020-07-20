public class Task4 {
    public static void main(String[] args) {
        int a = 4;

        int[][] arr = new int[a][a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = j + i;
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
}




public class Task3 {
    public static void main(String[] args) {
        int num0 = 1;
        int num1 = 1;
        int num2;
        System.out.print(num0 + " " + num1 + " ");
        for (int i = 3; i <= 20; i++) {
            num2 = num0 + num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
    }
}


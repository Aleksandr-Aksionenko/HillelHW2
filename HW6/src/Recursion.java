public class Recursion {

    public static void main(String[] args) {

        taskOne(8);

        System.out.println(taskTwo(562));
    }

    public static void taskOne(int n) {
        if (n == 0)
            return;
        taskOne(n - 1);
        System.out.println(n);
    }

    public static int taskTwo(int n) {
        if (n % 10 == n) //
            return n;
        else {
            int digit = n % 10;
            return digit + taskTwo(n / 10);
        }
    }
}
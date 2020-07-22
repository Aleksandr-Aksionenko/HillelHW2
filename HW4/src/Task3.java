public class Task3 {
    public static void main(String[] args) {

        int[] arrayNumbers = {12, 44, 36, 148, 657, 747, 743};

        for (Integer number : arrayNumbers) {
            if (hasDifferentDigits(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean hasDifferentDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            if (numberHasSuchDigit(number, digit)) {
                return false;
            }
        }
        return true;
    }

    private static boolean numberHasSuchDigit(int number, int comparingDigit) {
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            if (digit == comparingDigit) {
                return true;
            }
        }
        return false;
    }
}







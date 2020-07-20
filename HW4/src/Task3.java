public class Task3 {
    public static void main(String[] args) {
        int[] num = {1255, 231, 22, 845};

        int[] arrayLength = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            int tmp = 0;
            int number = num[i];
            while (number != 0) {
                number /= 10;
                tmp++;
                arrayLength[i] = tmp;
            }
        }

        for (int u = 0; u < arrayLength.length; u++) {
            int[] arrayNum = new int[arrayLength[u]];
            int tmpNum = num[u];
            int tmpIndex = 0;
            while (tmpNum != 0) {

                arrayNum[tmpIndex] = tmpNum % 10;
                tmpNum = tmpNum / 10;
                tmpIndex++;
            }
            for (int q = 1; q < arrayNum.length; q++) {
                int counterRep = 0;
                for (int w = 0; w < arrayNum.length; w++) {
                    if (arrayNum[q] == arrayNum[w]) {
                        counterRep = counterRep + 1;

                    }
                    if (counterRep == 1) {
                        System.out.println(num[q]);

                    }

                }

            }
        }
    }
}








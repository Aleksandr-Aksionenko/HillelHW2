public class Task1 {
    public static void main(String[] args) {
        int[] arrayN = {1, 4, 64, 76, 2, 1, 41, 2, 1, 41, 3, 6, 3, 12, 6, 8, 2};
        int[] arrayK = {76, 2, 1};
        boolean isInput = false;
        int count = 0;
        for (int i = 0; i < arrayN.length - 1; i++) {
            if (count == arrayK.length)
                break;
            if (arrayN.length - i < arrayK.length) {
                break;
            } else {
                if (arrayN[i] == arrayK[0]) {
                    int tmp = i + 1;
                    count++;
                    isInput = true;
                    for (int j = 1; j < arrayK.length; j++) {
                        if (arrayN[tmp] == arrayK[j]) {
                            tmp++;
                            count++;
                            isInput = true;
                            if (count == arrayK.length) {
                                break;
                            }
                        } else {
                            isInput = false;
                            count = 0;
                            break;
                        }
                    }

                }
            }

        }
        if (isInput == true) {
            System.out.println("Есть последовательность ");
        } else {
            System.out.println("Последовательности нет ");
        }
    }
}





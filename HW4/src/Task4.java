public class Task4 {
    public static void main(String[] args) {
        int n = 0;
        int k = 35;
        int kor = (int) Math.sqrt(k);
        if (kor * kor < k) {
            kor++;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < kor; j++) {
                if (n == k)
                    break;
                n++;
                System.out.print(n + "\t");
            }
            System.out.println();
        }
    }
}





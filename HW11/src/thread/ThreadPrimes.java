package thread;

import arrayUtils.Utils;

public class ThreadPrimes implements Runnable {

    private int[] primes;
    private int from;
    private int to;
    private Primes storage;

    public ThreadPrimes(int from, int to, Primes storage) {
        this.primes = new int[0];
        this.from = from;
        this.to = to;
        this.storage = storage;
    }


    @Override
    public void run() {
        int count = 0;
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                primes = Utils.arrayByLength(primes, 1);
                primes[count] = i;
                count++;
            }
        }
        storage.addPrimes(primes, count);
    }

    private boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Primes getStorage() {
        return storage;
    }

}

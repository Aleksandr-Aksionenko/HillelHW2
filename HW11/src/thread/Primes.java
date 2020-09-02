package thread;

import arrayUtils.Utils;

import java.util.Arrays;

public class Primes {

    private int[] primes;

    public Primes() {
        primes = new int[0];
    }

    public synchronized void addPrimes(int[] array, int amountOfElements) {
        int previousArrayLength = this.primes.length;
        primes = Utils.arrayByLength(primes, amountOfElements);
        System.arraycopy(array, 0, primes, primes.length - amountOfElements, amountOfElements);
        for (int number : array) {
            primes[previousArrayLength++] = number;
    }}
    public int[] getPrimes() {
        return primes;
    }

    @Override
    public String toString() {
        return Arrays.toString(primes);
    }
}

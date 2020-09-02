package runner;

import thread.Primes;
import thread.ThreadPrimes;

public class Run {

    private int fromIndex;
    private int toIndex;
    private int threadsCount;
    private Thread[] finderThreads;
    private Primes storage;

    public Run(int fromIndex, int toIndex, int threadsCount, Primes storage) {
        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
        this.threadsCount = threadsCount;
        this.storage = storage;
        intervalDivision();
    }

    public void startThreads() throws InterruptedException {
        for (Thread thread : finderThreads) {
            thread.start();
            thread.join();
        }
    }

    private void intervalDivision() {
        int period = (toIndex - fromIndex) / threadsCount;
        finderThreads = new Thread[threadsCount];
        int minI = fromIndex;
        for (int i = 0; i < threadsCount; i++) {
            finderThreads[i] = new Thread(new ThreadPrimes(minI, period, storage));
            minI = period + 1;
            period = period + minI;
        }
    }


}

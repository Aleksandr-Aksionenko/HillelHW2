package runner;

import thread.Primes;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        int from = 5;
        int to = 100;
        int threadsCount = 2;

        Primes storage = new Primes();
        Run run = new Run(from, to, threadsCount, storage);

        run.startThreads();

        for (int number : storage.getPrimes()) {
            System.out.println(number);
        }


        }
    }


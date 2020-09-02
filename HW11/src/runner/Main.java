package runner;

import thread.Primes;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lower bound");
        int from = scanner.nextInt();
        System.out.println("upper boundary entry");
        int to = scanner.nextInt();
        System.out.println("input streams");
        int threadsCount = scanner.nextInt();

        Primes storage = new Primes();
        Run run = new Run(from, to, threadsCount, storage);

        run.startThreads();

        for (int number : storage.getPrimes()) {

            System.out.println(number);
        }


    }
}


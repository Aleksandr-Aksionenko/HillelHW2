package inputOutput;

import exception.ExceptionNumbers;
import flowers.Accessory;
import flowers.Bouquet;
import flowers.Flowers;
import flowersWorker.FlowersShop;

import java.util.Scanner;

public class ConsoleFlowers {
    private static Scanner scanner;
    private FlowersShop flowersShop;


    public ConsoleFlowers(FlowersShop flowersShop) {
        this.flowersShop = flowersShop;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) throws ExceptionNumbers {
        FlowersShop shop = new FlowersShop();
        ConsoleFlowers flowersWorker = new ConsoleFlowers(shop);
        flowersWorker.start();
        flowersWorker.stop();
    }

    public void start() throws ExceptionNumbers {
        int chose = 0;
        do {
            System.out.println("Select item");
            System.out.println("1. Create a bouquet");
            System.out.println("2. Operations ");
            System.out.println("3. Print current bouquet");
            System.out.println("0. Exit");

            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    createBouquet();
                    break;
                case 2:
                    operateBouquets();
                    break;
                case 3:
                    System.out.println(getFlowersShop());
                    break;
                case 0:
                    stop();
                    break;
            }
        } while (true);
    }

    private static Accessory createAccessory() {
        Scanner s = new Scanner(System.in);
        System.out.println("Accessory name");
        String name = s.nextLine();
        System.out.println("Accessory prise");
        int priseAccessory = s.nextInt();
        return new Accessory(name, priseAccessory);
    }

    private static Flowers createFlower() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter name");
        String name = s.nextLine();
        System.out.println("Enter length stem");
        int lengthStem = s.nextInt();
        System.out.println("Enter age");
        int age = s.nextInt();
        System.out.println("Enter prise");
        int priseFlowers = s.nextInt();

        return new Flowers(name, lengthStem, age, priseFlowers);
    }

    private void createBouquet() {
        Scanner s = new Scanner(System.in);
        Bouquet createdBouquet = new Bouquet();
        System.out.println("1. Create Flowers" + "\n" + "2. Create accessory" + "\n" + "0. Back");
        int chose = s.nextInt();
        switch (chose) {
            case 1:
                Flowers createFlower = createFlower();
                createdBouquet.addFlower(createFlower);
                break;
            case 2:
                Accessory createAccessory = createAccessory();
                createdBouquet.addAccessory(createAccessory);
                break;
            case 0:
                flowersShop.createBouquet(createdBouquet);
                break;
        }
    }

    private void operateBouquets() throws ExceptionNumbers {
        int min;
        int max;
        Scanner s = new Scanner(System.in);
        System.out.println("1. Sort flowers by age");
        System.out.println("2. Find flowers by stem length");
        System.out.println("4. Add flower");
        System.out.println("5. Add accessory");
        System.out.println("0. Back");
        int chose = s.nextInt();

        switch (chose) {
            case 1:
                flowersShop.sortAge();
                break;
            case 2:
                System.out.println("Enter min. length:");
                min = inputCheckLength(scanner.nextInt());
                System.out.println("Enter max. length:");
                max = inputCheckLength(scanner.nextInt());
                flowersShop.filterByStemLength(min, max);
                break;
            case 4:
                System.out.println("Flower name: ");
                String name = scanner.nextLine();
                System.out.println("Length of stem:");
                int lengthStem = inputCheckLength(scanner.nextInt());
                System.out.println("age");
                int age = inputCheckAge(scanner.nextInt());
                System.out.println("Price:");
                int price = scanner.nextInt();
                flowersShop.AddFlowerToBouquet(new Flowers(name, lengthStem, age, price));
                break;
            case 5:
                System.out.println("Accessory name: ");
                name = scanner.next();
                System.out.println("Price:");
                price = scanner.nextInt();
                flowersShop.addAccessoryToBouquet(new Accessory(name, price));
            case 0:
                start();
                break;

        }
    }

    private int inputCheckLength(int number) throws ExceptionNumbers {
        if (number < 0) {
            throw new ExceptionNumbers("negative number input ");
        } else if (number == 0) {
            throw new ExceptionNumbers("Length cannot be zero");
        }
        return number;
    }

    private int inputCheckAge(int number) throws ExceptionNumbers {
        if (number < 0) {
            throw new ExceptionNumbers("negative number input ");
        }
        return number;
    }

    public void stop() {
        scanner.close();
    }

    public FlowersShop getFlowersShop() {
        return flowersShop;
    }

}

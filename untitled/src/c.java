import java.util.Arrays;
import java.util.Scanner;


public class c {
    public static void main(String[] args) {
        Add add = new Add();
        Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();
        int a = scanner.nextInt();
        int age=scanner.nextInt();
        int pr=scanner.nextInt();
        add.addFlowes(name,len,age,pr);
        System.out.println(add.addFlowes(name,len,age,pr));

    }

}

class Add {
    String name; int lengthStem; int age; int priseFlowers;


    public Flowes addFlowes(String name, int lengthStem, int age, int priseFlowers) {
        return new Flowes(, lengthStem, age, priseFlowers);
    }



class Flowes {

    private String nameFlower;
    private int lengthStem;
    private int age;
    private int priseFlowers;


    public Flowes(String nameFlower, int lengthStem, int age, int priseFlowers) {
        this.nameFlower = nameFlower;
        this.lengthStem = lengthStem;
        this.age = age;
        this.priseFlowers = priseFlowers;

    }


    public String getName() {
        return nameFlower;
    }

    public int getLengthStem() {
        return lengthStem;
    }

    public int getAge() {
        return age;
    }

    public int getPrise() {
        return priseFlowers;
    }
}}

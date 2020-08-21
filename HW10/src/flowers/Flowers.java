package flowers;

public class Flowers {

    private String nameFlower;
    private int lengthStem;
    private int age;
    private int priseFlowers;


    public Flowers(String nameFlower, int lengthStem, int age, int priseFlowers) {
        this.nameFlower = nameFlower;
        this.lengthStem = lengthStem;
        this.age = age;
        this.priseFlowers = priseFlowers;

    }

    public Flowers() {
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

    @Override
    public String toString() {
        return "Flowers{" +
                "nameFlower='" + nameFlower + '\'' +
                ", lengthStem=" + lengthStem +
                ", age=" + age +
                ", priseFlowers=" + priseFlowers +
                '}';
    }
}

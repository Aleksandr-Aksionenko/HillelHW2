package model;

public class Cars {

    private String brand;
    private int speed;
    private double fuelConsumption;
    private int engineCapacity;
    private int price;
    private String model;

    public Cars(String model, String brand, int speed, double fuelConsumption, int engineCapacity, int price) {
        this.model = model;
        this.brand = brand;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.engineCapacity = engineCapacity;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }


    public int getPrice(int i) {
        return price;
    }

    public int getPrice() {
        return price;
    }
}

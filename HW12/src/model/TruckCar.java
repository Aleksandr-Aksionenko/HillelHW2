package model;

public class TruckCar extends Cars {
    int liftingCapacity;
    public TruckCar(String brand, String model, int speed, double fuelConsumption, int engineCapacity, int price, int liftingCapacity) {
        super(brand, model, speed, fuelConsumption, engineCapacity, price);
        this.liftingCapacity = liftingCapacity;
    }
}

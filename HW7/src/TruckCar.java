public class TruckCar extends Cars {
    String brand;
    int speed;
    double fuelConsumption;
    int engineCapacity;
    String colour;
    int price;

    public TruckCar(String brand, int speed, double fuelConsumption, int engineCapacity, String colour, int price) {
        super(brand, speed, fuelConsumption, engineCapacity, colour, price);
        this.brand = brand;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.engineCapacity = engineCapacity;
        this.colour = colour;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TruckCar{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", fuelConsumption=" + fuelConsumption +
                ", engineCapacity=" + engineCapacity +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Cars {
    private String brand;
    private int speed;
    private double fuelConsumption;
    private int engineCapacity;
    private String colour;
    private int price;

    public Cars(String brand, int speed, double fuelConsumption, int engineCapacity, String colour, int price) {

        this.brand = brand;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.engineCapacity = engineCapacity;
        this.colour = colour;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    protected int getSpeed() {
        return speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice(int i) {
        return price;
    }

    protected int getPrice() {
        return price;
    }
}

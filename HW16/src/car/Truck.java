package car;

public class Truck extends Car {

	private int carryingCapacity;

	public Truck(String mark, String model, int fuelConsumption, int maxSpeed, int price, int carryingCapacity) {
		super(mark, model, fuelConsumption, maxSpeed, price);
		this.carryingCapacity = carryingCapacity;
	}

	public Truck(String[] carProperties) {
		this(carProperties[1], carProperties[2], Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]),
				Integer.parseInt(carProperties[5]), Integer.parseInt(carProperties[6]));
	}

	public String toOutputFormat() {
		return "Truck," + getMark() + "," + getModel() + "," + getFuelConsumption() + "," + getMaxSpeed() + ","
				+ getPrice() + "," + carryingCapacity;
	}

	@Override
	public String toString() {
		return "Truck [mark=" + getMark() + ", model=" + getModel() + ", fuelConsumption=" + getFuelConsumption()
				+ ", maxSpeed=" + getMaxSpeed() + ", price=" + getPrice() + ", carryingCapacity=" + carryingCapacity
				+ "]";
	}

	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}

}

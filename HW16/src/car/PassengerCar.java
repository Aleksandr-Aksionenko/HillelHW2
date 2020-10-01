package car;

public class PassengerCar extends Car {

	private int doorsCount;

	public PassengerCar(String mark, String model, int fuelConsumption, int maxSpeed, int price, int doorsCount) {
		super(mark, model, fuelConsumption, maxSpeed, price);
		this.doorsCount = doorsCount;
	}

	public PassengerCar(String[] carProperties) {
		this(carProperties[1], carProperties[2], Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]),
				Integer.parseInt(carProperties[5]), Integer.parseInt(carProperties[6]));
	}
	
	public String toOutputFormat() {
		return "PassengerCar," + getMark() + "," + getModel() + "," + getFuelConsumption() + "," + getMaxSpeed() + ","
				+ getPrice() + "," + doorsCount;
	}

	@Override
	public String toString() {
		return "PassengerCar [mark=" + getMark() + ", model=" + getModel() + ", fuelConsumption=" + getFuelConsumption()
				+ ", maxSpeed=" + getMaxSpeed() + ", price=" + getPrice() + ", doorsCount=" + doorsCount + "]";
	}

	public int getDoorsCount() {
		return doorsCount;
	}

	public void setDoorsCount(int doorsCount) {
		this.doorsCount = doorsCount;
	}

}

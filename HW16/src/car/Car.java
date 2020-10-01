package car;

public abstract class Car {

	private String mark;
	private String model;
	private int fuelConsumption;
	private int maxSpeed;
	private int price;

	public Car(String mark, String model, int fuelConsumption, int maxSpeed, int price) {
		this.mark = mark;
		this.model = model;
		this.fuelConsumption = fuelConsumption;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}

	public abstract String toOutputFormat();

	public int compareFuelToAnotherCar(Car another) {
	    return this.getFuelConsumption() - another.getFuelConsumption();
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

package flowers;

public class Accessory {


    private String nameAccessory;
    private int priceAccessory;

    public Accessory(String nameAccessory, int priceAccessory) {
        this.nameAccessory = nameAccessory;
        this.priceAccessory = priceAccessory;
    }

    public String getNameAccessory() {
        return nameAccessory;
    }

    public int getPriceAccessory() {
        return priceAccessory;
    }

    public String toString() {
        return "Accessory " + nameAccessory + " [price: " + priceAccessory + "] ";
    }

}


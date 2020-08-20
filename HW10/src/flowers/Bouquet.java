package flowers;


import utils.ArrayUtils;

import java.util.Arrays;

public class Bouquet {
    private Flowers[] flowers;
    private Accessory[] accessories;

    public Bouquet() {
    }

    public Bouquet(Flowers[] flowers, Accessory[] accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public void addFlower(Flowers flower) {
        flowers = ArrayUtils.extendArray(flowers, flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories = ArrayUtils.extendArray(accessories, accessory);
    }

    public int price() {
        int price = 0;
        for (Accessory accessory : accessories) {
            price += accessory.getPriceAccessory();
        }
        for (Flowers flower : flowers) {
            price += flower.getPrise();
        }
        return price;
    }

    public Flowers[] getFlowers() {
        return flowers;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + Arrays.toString(flowers) +
                ", accessories=" + Arrays.toString(accessories) +
                "Price=" + price() +
                '}';
    }
}

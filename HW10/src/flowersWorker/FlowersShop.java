package flowersWorker;

import flowers.Accessory;
import flowers.Bouquet;
import flowers.Flowers;
import utils.ArrayUtils;

import java.util.Arrays;

public class FlowersShop {
    private Bouquet[] bouquets = new Bouquet[]{};
    private Flowers[] flowers = new Flowers[]{};
    private Accessory[] accessories = new Accessory[]{};
    private Bouquet bouquet = new Bouquet();
    private Flowers flower = new Flowers();

    public Bouquet AddFlowerToBouquet(Flowers flowers) {
        bouquet.addFlower(flowers);
        return bouquet;
    }

    public Bouquet addAccessoryToBouquet(Accessory accessory) {
        bouquet.addAccessory(accessory);
        return bouquet;
    }

    public Bouquet[] addBouquets(Bouquet bouquet) {
        return bouquets = ArrayUtils.extendArray(bouquets, bouquet);
    }

    public Accessory[] createAccessories(Accessory accessory) {
        return accessories = ArrayUtils.extendArray(accessories, accessory);
    }


    public Flowers[] createFlowers(Flowers flower) {
        return flowers =  ArrayUtils.extendArray(flowers, flower);
    }

    public Bouquet[] createBouquet(Bouquet bouquet) {
        return bouquets =  ArrayUtils.extendArray(bouquets, bouquet);
    }
    public void filterByStemLength(int min, int max) {
        for (Bouquet bouquet : bouquets) {
            for (Flowers flower : bouquet.getFlowers())
                if (flower.getLengthStem() >= min && flower.getLengthStem() <= max) {
                    System.out.println(flower);
                }
        }
    }
    public void sortAge() {
        Flowers tmp;
        for (Bouquet bouquet : bouquets) {
            for (int i = 0; i < bouquet.getFlowers().length; i++) {
                for (int j = 1; j < bouquet.getFlowers().length - i; j++) {
                    if (bouquet.getFlowers()[j - 1].getAge() > bouquet.getFlowers()[j].getAge()) {
                        tmp = bouquet.getFlowers()[j - 1];
                        bouquet.getFlowers()[j - 1] = bouquet.getFlowers()[j];
                        bouquet.getFlowers()[j] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(bouquet.getFlowers()));
        }
    }
    public void createBouquet() {
        Bouquet bouquet = new Bouquet();
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }


}

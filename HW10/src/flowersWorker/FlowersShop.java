package flowersWorker;

import exception.ExceptionNumbers;
import flowers.Accessory;
import flowers.Bouquet;
import flowers.Flowers;
import utils.ArrayUtils;

import java.util.Arrays;

public class FlowersShop {
    private Bouquet[] bouquets = new Bouquet[0];
    private Flowers[] flowers = new Flowers[0];
    private Accessory[] accessories = new Accessory[0];
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

    public Bouquet[] createBouquet(Bouquet bouquet) {
        return bouquets = ArrayUtils.extendArray(bouquets, bouquet);
    }


    public Flowers[] filterByStemLength(int min, int max) throws ExceptionNumbers {
        if (min < 0 ){throw new ExceptionNumbers ("negative number input ");
        }
        Flowers[] filterFlower = new Flowers[]{};
        for (Flowers flo : flowers) {
            if (min < flo.getLengthStem() &&flo.getLengthStem()  < max) {
                filterFlower = ArrayUtils.extendArray(filterFlower,flo);
            }
        }
        return filterFlower;
    }


    public void sortAge() {
        Flowers tmp;
        for (Bouquet bouquet : bouquets) {
            for (int i = 0; i < bouquet.getFlowers().length; i++) {
                    if (bouquet.getFlowers()[i - 1].getAge() > bouquet.getFlowers()[i].getAge()) {
                        tmp = bouquet.getFlowers()[i - 1];
                        bouquet.getFlowers()[i - 1] = bouquet.getFlowers()[i];
                        bouquet.getFlowers()[i] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(bouquet.getFlowers()));
        }

    @Override
    public String toString() {
        return "FlowersShop{" +
                "bouquets=" + Arrays.toString(bouquets) +
                ", flowers=" + Arrays.toString(flowers) +
                ", accessories=" + Arrays.toString(accessories) +
                ", bouquet=" + bouquet +
                ", flower=" + flower +
                '}';
    }
}



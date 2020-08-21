package utils;

import flowers.Accessory;
import flowers.Bouquet;
import flowers.Flowers;

import static java.lang.System.arraycopy;

public class ArrayUtils {


    public static Flowers[] extendArray(Flowers[] flowers, Flowers flower) {
        Flowers[] result = new Flowers[flowers.length + 1];
        arraycopy(flowers, 0, result, 0, flowers.length);
        result[flowers.length] = flower;
        return result;
    }
    public static Accessory[] extendArray(Accessory[] accessories, Accessory accessory) {
        Accessory[] result = new Accessory[accessories.length + 1];
        arraycopy(accessories, 0, result, 0, accessories.length);
        result[accessories.length] = accessory;
        return result;
    }

    public static Bouquet[] extendArray(Bouquet[] bouquets, Bouquet bouquet) {
        Bouquet[] result = new Bouquet[bouquets.length + 1];
        arraycopy(bouquets,0,result,0, bouquets.length);
        result[bouquets.length] = bouquet;
        return result;
    }

}

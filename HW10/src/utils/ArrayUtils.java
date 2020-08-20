package utils;

import flowers.Accessory;
import flowers.Bouquet;
import flowers.Flowers;

public class ArrayUtils {

    public static Flowers[] extendArray(Flowers[] init, Flowers added) {
        Flowers[] extend = new Flowers[init.length + 1];
        for (int i = 0; i < init.length; i++) {
            extend[i] = init[i];
        }
        extend[init.length] = added;
        return extend;
    }

    public static Bouquet[] extendArray(Bouquet[] init, Bouquet added) {

        Bouquet[] extend = new Bouquet[init.length + 1];
        for (int i = 0; i < init.length; i++) {
            extend[i] = init[i];
        }
        extend[init.length] = added;
        return extend;

    }

    public static Accessory[] extendArray(Accessory[] init, Accessory added) {
        Accessory[] extend = new Accessory[init.length + 1];
        for (int i = 0; i < init.length; i++) {
            extend[i] = init[i];
        }
        extend[init.length] = added;
        return extend;

    }

}

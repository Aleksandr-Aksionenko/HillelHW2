package util;

import model.Cars;

import java.util.Comparator;

public class CarComparator implements Comparator <Cars>{

    @Override
    public int compare(Cars car1, Cars car2) {
        return Double.compare(car1.getFuelConsumption(),car2.getFuelConsumption());
    }

}

package taxipark;

import car.Car;

import java.util.Comparator;

public class CarComparator implements Comparator <Car>{

    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car1.getFuelConsumption(),car2.getFuelConsumption());
    }

}

package taxipark;

import java.util.*;

import car.Car;

public class TaxiPark {

    private ArrayList<Car> cars;

    public TaxiPark(ArrayList<Car> cars) {
        this.cars = cars;
    }


    public void comparatorSort() {
        Collections.sort(cars, new CarComparator());
    }

    public void lambdaSort() {
        Comparator<Car> comparator = (carOne, carTwo) -> Integer.compare(carOne.getFuelConsumption(), carTwo.getFuelConsumption());
        Collections.sort(cars, comparator);
    }

    public void methodReference() {
        Comparator<Car> comparator = new CarComparator();
        Collections.sort(cars, comparator::compare);
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",\n");
        for (Car car : cars) {
            sj.add(car.toString());
        }
        return sj.toString();
    }


}

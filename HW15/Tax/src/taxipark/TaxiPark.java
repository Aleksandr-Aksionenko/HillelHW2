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

    public ArrayList<Car> filterCarsBySpeed(int max, int min) {
        ArrayList<Car> speedCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                speedCars.add(car);
            }
        }
        return speedCars;
    }

    public double sumPrice() {
        double sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum;
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

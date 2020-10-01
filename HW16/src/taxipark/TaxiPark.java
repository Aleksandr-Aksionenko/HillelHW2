package taxipark;

import java.util.*;
import java.util.stream.Collectors;

import car.Car;

public class TaxiPark {

    private ArrayList<Car> cars;

    public TaxiPark(ArrayList<Car> cars) {
        this.cars = cars;
    }
    
    public void carsSort() {
        cars = (ArrayList<Car>) cars.stream().sorted(CarComparator::compare).collect(Collectors.toList());
    }

    public ArrayList<Car> filterCarsBySpeed(int max, int min) {
      return (ArrayList<Car>) cars.stream().filter(car -> car.getMaxSpeed() >= min && car.getMaxSpeed() <= max).collect(Collectors.toList());
    }

    public double sumPrice() {
        return cars.stream().mapToDouble(Car::getPrice).sum();
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

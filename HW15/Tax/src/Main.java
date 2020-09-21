import car.Car;
import car.PassengerCar;
import car.Truck;
import taxipark.TaxiPark;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new PassengerCar("VAZ", "23da4", 12, 180, 31000, 4));
        cars.add(new PassengerCar("VAZ", "45d", 11, 180, 21000, 4));
        cars.add(new Truck("MAN", "we2", 45, 120, 150000, 25));
        TaxiPark tp = new TaxiPark(cars);
        System.out.println(tp);
        System.out.println();
        tp.comparatorSort();
        System.out.println(tp);
    }
}
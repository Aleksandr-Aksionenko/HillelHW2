package run;

import model.*;
import taxPark.CarProcessor;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int min = 100;
        int max = 500;
        TruckCar[] truckCar = {
                new TruckCar("Nyva", 132, 2.3, 334, "yellow", 123000,134),
                new TruckCar("FORD", 1382, 2.3, 334, "yellow", 123000)};
        PassengerCar[] passengerCars = {
                new PassengerCar("Audi", 123, 2.5, 211, "Red", 40000),
                new PassengerCar("BMW", 322, 4.3, 300, "Ora", 20000)};

        CarProcessor carProcessor = new CarProcessor() {
        };
        double totalPrice = carProcessor.sumPrice(truckCar) + carProcessor.sumPrice(passengerCars);
        System.out.println(totalPrice);
        System.out.println(Arrays.toString(carProcessor.sortCars(truckCar)));
    }
}

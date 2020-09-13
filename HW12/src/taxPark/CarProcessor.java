package taxPark;

import model.Cars;
import util.CarComparator;

import java.util.Arrays;
import java.util.Comparator;

public class CarProcessor {

    private Cars[] cars;

    public CarProcessor(Cars... count) {
        cars = count;
    }

    public String speed(int min, int max) {
        Cars[] checkCars = new Cars[]{};
        for (Cars car : cars) {
            if (min < car.getSpeed() && car.getSpeed() < max) {
                checkCars = checkCars(checkCars, car);
            }
        }
        return null;
    }

    public void comparatorSort() {
        Arrays.sort(cars, new CarComparator());
    }
    public void lambdaSort(){
        Arrays.sort(cars,(car1,car2)->Double.compare(car1.getFuelConsumption(),car2.getFuelConsumption()));
    }
    public void methodReference(){
        Arrays.sort(cars, Comparator.comparingDouble(Cars::getFuelConsumption));
    }

    private Cars[] checkCars(Cars[] checkCars, Cars car) {
        Cars[] check = new Cars[checkCars.length + 1];
        for (int i = 0; i < checkCars.length; i++) {
            checkCars[i] = checkCars[i];
        }
        check[checkCars.length] = car;
        return check;
    }


    public double sumPrice() {
        int sumPrise = 0;
        for (Cars car : cars) {
            sumPrise = car.getPrice() + sumPrise;
        }
        return sumPrise;
    }


    public String toString(Cars[] speedCars) {

        String report = "";
        for (Cars car : speedCars) {
            report += car.toString() + "\n";
        }
        return report;

    }

}


import java.util.Arrays;

public class CarProcessor {


    private Cars[] cars;


    public Cars[] speed(int min, int max) {
        Cars[] checkCars = new Cars[]{};
        for (Cars car : cars) {
            if (min < car.getSpeed() && car.getSpeed() < max) {
                checkCars = checkCars(checkCars, car);
            }

        }
        return checkCars;
    }

    private Cars[] checkCars(Cars[] checkCars, Cars car) {
        Cars[] check = new Cars[checkCars.length + 1];
        for (int i = 0; i < checkCars.length; i++) {
            checkCars[i] = checkCars[i];
        }
        check[checkCars.length] = car;
        return check;
    }


    public int sumPrice(Cars[] cars) {
        int sumPrise = 0;
        for (Cars car : cars) {
            sumPrise = car.getPrice() + sumPrise;
        }
        return sumPrise;
    }


}


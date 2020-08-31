package taxPark;

import model.Cars;

public  class CarProcessor  {

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
    public Cars[] sortCars() {

        Cars[] sortedCars = cars;
        for (int i = 0; i < sortedCars.length; i++) {
            double minConsumption = sortedCars[i].getFuelConsumption();
            Cars minConsumptionCar = sortedCars[i];
            int minId = i;
            for (int j = i + 1; j < sortedCars.length; j++) {
                if (sortedCars[j].getFuelConsumption() < minConsumption) {
                    minConsumptionCar = sortedCars[j];
                    minId = j;
                }
            }
            Cars temp = sortedCars[i];
            sortedCars[i] = minConsumptionCar;
            sortedCars[minId] = temp;
        }
        return sortedCars;
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


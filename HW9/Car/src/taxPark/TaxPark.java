package taxPark;

import model.*;


public interface TaxPark {

        Cars[] speed(int minSpeed, int maxSpeed);

        double sumPrice(Cars[] cars);

        Cars[] sortCars(Cars[] cars);

        String toString(Cars[] speedCars);

    }


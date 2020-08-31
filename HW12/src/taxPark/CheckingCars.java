package taxPark;

import model.Cars;
import model.PassengerCar;
import model.TruckCar;

import javax.sound.midi.Track;

public class CheckingCars {

    public Cars[] CreateCars(String car) {
        Cars[] newCars = new Cars[]{};
        String[] lines = car.split(";\r\n");
        int i = 0;
        for (String line : lines) {
            String[] carProperties = line.split(",");
            switch (carProperties[0]) {
                case "Truck":
                    newCars[i] = new TruckCar(carProperties[0], carProperties[1], Integer.parseInt(carProperties[2]), Integer.parseInt(carProperties[3]),
                            Integer.parseInt(carProperties[4]), Integer.parseInt(carProperties[5]), Integer.parseInt(carProperties[6]));
                    break;
                case "Passenger":
                    newCars[i] = new PassengerCar(carProperties[0], carProperties[1], Integer.parseInt(carProperties[2]), Integer.parseInt(carProperties[3]),
                            Integer.parseInt(carProperties[4]), Integer.parseInt(carProperties[5]));
                    break;
            }
            i++;
        }
        return newCars;
    }
}


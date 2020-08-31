package run;

import InputOutput.Reader;
import InputOutput.Writer;
import model.Cars;
import taxPark.CarProcessor;
import taxPark.CheckingCars;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class Run {
    public static void main(String[] args) throws IOException {
        int min = 20;
        int max = 400;
        String cars = Reader.read();
        CheckingCars newCars = new CheckingCars();
        CarProcessor carProcessor = new CarProcessor(newCars.CreateCars(cars));
      Writer.writeFile(new File("CarsWrite.txt"), carProcessor.sortCars());
    }
}

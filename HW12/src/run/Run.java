package run;

import InputOutput.InputOutput;
import taxPark.CarProcessor;

import java.io.File;
import java.io.IOException;


public class Run {
    public static void main(String[] args) throws IOException {
        int min = 20;
        int max = 400;
        String cars = InputOutput.read();
        InputOutput newCars = new InputOutput();
        CarProcessor carProcessor = new CarProcessor(newCars.CreateCars(cars));
        InputOutput.writeFile(new File("CarsWrite.txt"),carProcessor.comparatorSort());
    }
}

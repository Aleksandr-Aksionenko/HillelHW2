package run;

import InputOutput.Reader;
import InputOutput.Writer;
import taxPark.CarProcessor;
import taxPark.CheckingCars;

import java.io.File;
import java.io.IOException;


public class Run {
    public static void main(String[] args) throws IOException {
        int min = 100;
        int max = 500;
        String cars = Reader.read(new File("\\HillelHW2\\HillelHW2\\HW12\\Cars.txt"));
        CheckingCars newCars = new CheckingCars();
        CarProcessor carProcessor = new CarProcessor(newCars.CreateCars(cars));
      Writer.writeFile(new File("\\HillelHW2\\HillelHW2\\HW12\\CarsWrite.txt"), carProcessor.speed(min, max));
    }
}

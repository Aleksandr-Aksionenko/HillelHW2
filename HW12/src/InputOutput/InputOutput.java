package InputOutput;

import model.Cars;
import model.PassengerCar;
import model.TruckCar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {
    public static String read() throws IOException {
        String content = null;
        try (FileInputStream fis = new FileInputStream(new File("Cars.txt"))) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);

            content = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void writeFile(File files, String text) throws IOException {
        try {  FileWriter writer = new FileWriter(files);
            writer.write(text);
            writer.flush();
        }catch (NullPointerException e){
        }
    }
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



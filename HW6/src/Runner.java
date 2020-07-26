public class Runner {
    public static void main(String[] args) {
        Car[] cars = {new Car(101, "BMW", "116d", 2010, "Red", 300000, "ax123ac"),
                new Car(302, "Mercedes-Benz", "w140", 2019, "Blue", 205000, "ax1833bv"),
                new Car(1203, "AUDI", "1162d", 2019, "Yellow", 600000, "ax9323ou"),
                new Car(4204, "BMW", "114X", 2018, "Red", 300000, "ax1202v"),
                new Car(305, "Lexus", "1685U", 2011, "Black", 400000, "ax1203kv")};

        CarProcessor proc = new CarProcessor();
        proc.checkBrand("BMW");
        proc.checkUseYears("BMW",9);
        proc.checkPrice(2019, 40000);
        proc.checkBrand(cars, "BMW");
        proc.checkUseYears(cars, "BMW", 9);
        proc.checkPrice(cars, 2019, 40000);
    }
}

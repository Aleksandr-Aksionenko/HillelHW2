public class CarProcessor {

    public void checkBrand(Car[] cars, String brand) {

        for (Car car : cars) {
            if (car.brand.equals(brand)) {
                showInfo(car);
            }
        }
    }

    public void checkUseYears(Car[] cars, String brand, int year) {
        int ourYear = 2020;
        for (Car car : cars) {
            if (car.brand.equals(brand) & year < (ourYear - car.year)) {
                showInfo(car);
            }
        }
    }

    public void checkPrice(Car[] cars, Integer year, int price) {
        for (Car car : cars) {
            if (car.year.equals(year) & price < car.price)
                showInfo(car);
        }
    }

    private void showInfo(Car cars) {
        System.out.println("id:" + cars.id + " " + cars.brand + " " + cars.model + " " +
                cars.year + "  " + cars.colour + " " + cars.price + "$ " +
                cars.registrationNumber);
    }
}






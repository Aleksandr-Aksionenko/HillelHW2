
public class CarProcessor {

    Car[] cars;

    public CarProcessor(Car[] cars) {
        this.cars = cars;
    }

    public CarProcessor() {
        this.cars = new Car[]{};
    }

    public void checkBrand(String brand) {
        if ( this.cars != null) {
            for (Car car : cars)
                if (car.brand.equals(brand)) {
                    showInfo(car);
                }
        }
    }

    public void checkUseYears(String brand, int year) {
        int ourYear = 2020;
        if ( this.cars != null) {
            for (Car car :  this.cars)
                if (car.brand.equals(brand) & year < (ourYear - car.year)) {
                    showInfo(car);
                }
        }
    }

    public void checkPrice(int year, int price) {
        if (this.cars  != null) {
            for (Car car : this.cars )
                if (car.year == year & price < car.price)
                    showInfo(car);
        }
    }

    public void checkBrand(Car[] cars, String brand) {
        for (Car car : cars)
            if (car.brand.equals(brand)) {
                showInfo(car);
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

    public void checkPrice(Car[] cars, int year, int price) {
        for (Car car : cars) {
            if (car.year == year & price < car.price)
                showInfo(car);
        }
    }

    private void showInfo(Car cars) {
        System.out.println("id:" + cars.id + " " + cars.brand + " " + cars.model + " " +
                cars.year + "  " + cars.colour + " " + cars.price + "$ " +
                cars.registrationNumber);
    }
}

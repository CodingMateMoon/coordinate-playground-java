package rentcar;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private static List<Car> cars;

    public static RentCompany create() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
    }
}

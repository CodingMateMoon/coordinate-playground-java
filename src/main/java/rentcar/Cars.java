package rentcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<Car>();
    }

    public void add(Car car) {
        cars.add(car);
    }
}

package rentcar;

public class Avante extends Car {

    private final String name;
    private final int distancePerLiter;

    public Avante(int distance) {
        this.distance = distance;
        this.name = "Avante";
        this.distancePerLiter = 15;
    }

    @Override
    double getDistancePerLiter() {
        return this.distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return this.distance;
    }

    @Override
    String getName() {
        return this.name;
    }
}

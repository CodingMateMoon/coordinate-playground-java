package rentcar;

public class Avante extends Car {

    private final String name;
    private final int distancePerLiter;

    public Avante(int distance) {
        this.distance = distance;
        this.name = "Sonata";
        this.distancePerLiter = 10;
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

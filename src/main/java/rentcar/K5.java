package rentcar;

public class K5 extends Car {
    private final String name;
    private final int distancePerLiter;

    public K5(int distance) {
        this.distance = distance;
        this.name = "K5";
        this.distancePerLiter = 13;
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

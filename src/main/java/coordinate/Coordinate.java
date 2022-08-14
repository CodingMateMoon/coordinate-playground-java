package coordinate;

public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calculateLineLength(Coordinate second) {
        return Math.sqrt(Math.pow((this.x - second.x), 2) + Math.pow((this.y - second.y), 2));
    }
}

package coordinate;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calculateLineLength(Point second) {
        return Math.sqrt(Math.pow((this.x - second.x), 2) + Math.pow((this.y - second.y), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

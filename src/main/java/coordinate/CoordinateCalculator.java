package coordinate;

import java.util.HashSet;
import java.util.List;

public class CoordinateCalculator {
    public static double calculateLineLength(Point first, Point second) {
        return first.calculateLineLength(second);
    }

    public static int calculateRectangleArea(List<Point> pointList) {
        int standardX, standardY, width, height;
        standardX = standardY = width = height = 0;

        for (int i = 0; i < pointList.size(); i++) {
            Point point = pointList.get(i);
            if (i == 0) {
                standardX = point.getX();
                standardY = point.getY();
                continue;
            }
            if (standardX != point.getX()) {
                width = Math.abs(standardX - point.getX());
            }
            if (standardY != point.getY()) {
                height = Math.abs(standardY - point.getY());
            }
        }

        return width * height;
    }
}

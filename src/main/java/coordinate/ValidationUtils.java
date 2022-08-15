package coordinate;

import java.util.HashSet;
import java.util.List;

public class ValidationUtils {

    public static boolean validateRentangle(List<Point> pointList) {
        HashSet<Integer> xSet = new HashSet<Integer>();
        HashSet<Integer> ySet = new HashSet<Integer>();
        for (Point point : pointList) {
            xSet.add(point.getX());
            ySet.add(point.getY());
        }

        return xSet.size() == 2 && ySet.size() == 2;
    }
}

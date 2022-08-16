package coordinate;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class CoordinateCalculatorTest {
    @Test
    void calculateLineLength() {
        Point first = new Point(10, 10);
        Point second = new Point(14, 15);
        System.out.println(CoordinateCalculator.calculateLineLength(first, second));
        assertThat(CoordinateCalculator.calculateLineLength(first, second)).isEqualTo(6.403124, offset(0.00000099));
    }

    @Test
    void validateRentangle() {
        Point p1 = new Point(11, 10);
        Point p2 = new Point(22, 10);
        Point p3 = new Point(22, 18);
        Point p4 = new Point(10, 18);

        assertThat(ValidationUtils.validateRentangle(Arrays.asList(p1, p2, p3, p4))).isFalse();
    }

    @Test
    void calculateRectangleArea() {

        Point p1 = new Point(10, 10);
        Point p2 = new Point(22, 10);
        Point p3 = new Point(22, 18);
        Point p4 = new Point(10, 18);

        List<Point> pointList = new ArrayList<Point>();

        assertThat(CoordinateCalculator.calculateRectangleArea(Arrays.asList(p1, p2, p3, p4))).isEqualTo(96);
    }
}

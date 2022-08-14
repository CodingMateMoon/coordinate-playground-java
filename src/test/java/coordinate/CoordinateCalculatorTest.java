package coordinate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class CoordinateCalculatorTest {
    @Test
    void calcuateLineLength() {
        Coordinate first = new Coordinate(10, 10);
        Coordinate second = new Coordinate(14, 15);
        System.out.println(CoordinateCalculator.calcuateLineLength(first, second));
        assertThat(CoordinateCalculator.calcuateLineLength(first, second)).isEqualTo(6.403124, offset(0.00000099));
    }
}

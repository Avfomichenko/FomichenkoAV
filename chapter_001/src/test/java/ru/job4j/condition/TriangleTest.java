package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/**
 * @author Fomichenkoav.
 * @version 1
 * @since 02.05.2017
 */
public class TriangleTest {
     /**
     * Test add.
     */
    @Test
    public void areaOfTriangle() {
        Point point = new Point(1,1);
       double result = Triangle.area(2, 2, 2);
        double except= 1.73;
        assertThat(result, closeTo(except, 0.01));
    }
}

package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Fomichenkoav.
 * @version 1
 * @since 23.04.2017
 */
public class PointTest {
     /**
     * Test add.
     */
    @Test
    public void test() {
        Point point = new Point(2, 6);
        boolean result = point.is(2, 2);
        int expected = 6;
        assertThat(result, is(expected));
    }
}

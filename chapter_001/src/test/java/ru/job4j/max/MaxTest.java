package ru.job4j.max;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Fomichenkoav.
 * @version 1
 * @since 23.04.2017
 */
public class MaxTest {
    /**
     *Test add.
     */
    @Test
    public void maximumNumberOfFirstAndSecond() {
        Max max = new Max();
        int result =  max.max(4, 1);
        int expected = 4;
        assertThat(result, is(expected));
    }
}


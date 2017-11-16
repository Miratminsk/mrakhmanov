package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      15.11.2017
 * @version    1.0
 */

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter maxim = new Counter();
        int result = maxim.add(1, 10);
        assertThat(result, is(30));
    }
}
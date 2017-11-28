package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      27.11.2017
 * @version    1.0
 */

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn array = new Turn();
        int[] numbers = {2, 6, 1, 4};
        int[] resultArray = array.back(numbers);
        int[] expectArray = {4, 1, 6, 2};
        assertThat(resultArray, is(expectArray));
    }
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn array = new Turn();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] resultArray = array.back(numbers);
        int[] expectArray = {5, 4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }
}
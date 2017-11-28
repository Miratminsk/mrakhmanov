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

public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort array = new BubbleSort();
        int[] numbers = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] resultArray = array.sort(numbers);
        int[] expectArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(resultArray, is(expectArray));
    }
    @Test
    public void whenSortArrayWithFiveElementsThenSortedArray() {
        BubbleSort array = new BubbleSort();
        int[] numbers = {5, 1, 2, 7, 3};
        int[] resultArray = array.sort(numbers);
        int[] expectArray = {1, 2, 3, 5, 7};
        assertThat(resultArray, is(expectArray));
    }
}
package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      28.11.2017
 * @version    1.0
 */

public class RotateArrayTest {

    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray array = new RotateArray();
        int[] [] numbers = {
                {1, 2},
                {3, 4}
        };
        int[] [] resultArray = array.rotate(numbers);
        int[] [] expectArray = {
                {3, 1},
                {4, 2}
        };
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray array = new RotateArray();
        int[] [] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] [] resultArray = array.rotate(numbers);
        int[] [] expectArray = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        assertThat(resultArray, is(expectArray));
    }
}
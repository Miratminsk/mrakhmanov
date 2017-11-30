package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      29.11.2017
 * @version    1.0
 */

public class ArrayDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate array = new ArrayDuplicate();
        String[] words = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] resultArray = array.remove(words);
        String[] expectArray = {"Привет", "Мир", "Супер"};
        assertThat(resultArray, arrayContainingInAnyOrder(expectArray));
    }
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateVersionTwo() {
        ArrayDuplicate array = new ArrayDuplicate();
        String[] words = {"Home", "Home", "Apartment", "Apartment", "Condo", "Condo"};
        String[] resultArray = array.remove(words);
        String[] expectArray = {"Home", "Apartment", "Condo"};
        assertThat(resultArray, arrayContainingInAnyOrder(expectArray));
    }
}
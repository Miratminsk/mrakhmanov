package ru.job4j.list;

import org.junit.Test;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertListTest {
    @Test
    public void when2ArrayThenList() {
        ConvertList conMat2List = new ConvertList();
        int[] inputOne = new int[]{6, 5};
        int[] inputTwo = new int[]{4, 3, 2, 1};
        List<int[]> inputList = new LinkedList<>();
        inputList.add(inputOne);
        inputList.add(inputTwo);
        List<Integer> expect = Arrays.asList(
                6, 5, 4, 3, 2, 1
        );
        List<Integer> result = conMat2List.convert(inputList);
        assertThat(result, is(expect));
    }

    @Test
    public void when4ArrayThenList() {
        ConvertList conMat2List = new ConvertList();
        int[] inputOne = new int[]{1, 2, 3, 4, 5};
        int[] inputTwo = new int[]{6, 7};
        int[] inputThree = new int[]{8, 9, 10, 11};
        int[] inputFour = new int[]{12, 13, 14};
        List<int[]> inputList = new LinkedList<>();
        inputList.add(inputOne);
        inputList.add(inputTwo);
        inputList.add(inputThree);
        inputList.add(inputFour);
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
        );
        List<Integer> result = conMat2List.convert(inputList);
        assertThat(result, is(expect));
    }
}

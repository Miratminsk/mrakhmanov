package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public List<Integer> convert(List<int[]> list) {
        List<Integer> listResult = new ArrayList<>();
        for(int[] a : list) {
            for (int b : a) {
                listResult.add(b);
            }
        }
        return listResult;
    }
}

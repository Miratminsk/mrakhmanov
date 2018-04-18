package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double)list.size() / (double)rows);
        int[][] array = new int[rows][cells];
        int listIndex = 0;
            for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
                for (int cellIndex = 0; cellIndex < cells; cellIndex++) {
                    if (listIndex < list.size()) {
                        array[rowIndex][cellIndex] = list.get(listIndex++);
                    } else  {
                        array[rowIndex][cellIndex] = 0;
                    }
                }

            }
        return array;
    }
}




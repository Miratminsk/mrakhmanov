package ru.job4j.array;

import java.util.Arrays;

/**
 * Class для удаления всех дубликатов из массива
 * @author     Mirat Rakhmanov
 * @since      29.11.2017
 * @version    1.0
 * Method remove удаляет все дубликаты из массива
 * * @param String[] array
 * @return возвращает массив без дубликатов
 */

public class ArrayDuplicate {

    public String[] remove(String[] array) {
        int sizeNew = array.length;
        for (int out = 0; out < sizeNew; out++) {
            for (int in = out + 1; in < sizeNew; in++) {
                if (array[in].equals(array[out])) {
                    array[in] = array[--sizeNew];
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, sizeNew);
    }
}
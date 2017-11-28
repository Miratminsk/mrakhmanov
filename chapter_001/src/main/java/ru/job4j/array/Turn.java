package ru.job4j.array;

/**
 * Class для "переворота" массива
 * @author     Mirat Rakhmanov
 * @since      27.11.2017
 * @version    2.0
 * Method back принимает массив целых чисел, а возвращает тот же массив, но перевёрнутый в обратной последовательности
 * @param int[] array
 * @return массив перевёрнутый в обратной последовательности
 */

public class Turn {

    public int[] back(int[] array) {
        for (int a = 0; a < array.length / 2;  a++) {
            int b = array [a];
            array [a] = array[array.length - a - 1];
            array[array.length - a - 1] = b;
        }
        return array;
    }
}
package ru.job4j.array;

/**
 * Class для сортировки массива методом перестановки
 * @author     Mirat Rakhmanov
 * @since      27.11.2017
 * @version    1.0
 * Method sort сортирует массив целых чисел, используя алгоритм сортировки пузырьком
 * @param int[] array
 * @return возвращает массив, отсортированный с помощью алгоритма пузырька
 */

public class BubbleSort {

    public int[] sort(int[] array) {
        for (int a = array.length - 1; a > 0; a--) {
            for (int b = 0; b < a; b++) {
                if (array[b] > array[b + 1]) {
                    int c = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = c;
                }
            }
        }
        return array;
    }
}
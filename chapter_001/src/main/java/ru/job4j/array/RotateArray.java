package ru.job4j.array;

/**
 * Class для поворота квадратного массива
 * @author     Mirat Rakhmanov
 * @since      28.11.2017
 * @version    1.0
 * Method rotate поворачивает двумерный массив по часовой стрелке
 * * @param int[] [] array
 * @return возвращает квадратный массив, повернутый по часовой стрелке
 */

public class RotateArray {

    public int[][] rotate(int[][] array) {
            for (int a = 0; a < array.length - 1; a++) {
                int b = 0;
                int c = array[b][b + a];
                array[b][b + a] = array[array[b].length - 1 - a][b];
                array[array[b].length - 1 - a][b] = array[array[b].length - 1][array.length - 1 - a];
                array[array[b].length - 1][array.length - 1 - a] = array[b + a][array.length - 1];
                array[b + a][array.length - 1] = c;
            }
            return array;
    }
}



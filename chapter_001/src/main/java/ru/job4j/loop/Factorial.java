package ru.job4j.loop;

/**
 * Class для вычмсления факториала
 * @author     Mirat Rakhmanov
 * @since      16.11.2017
 * @version    1.0
 * Method calc принимает положительное целое число n, и возвращать рассчитанный факториал для этого числа
 * @param n
 * @return факториал n
 */

    public class Factorial {


    public int calc(int n) {
        if (n == 0) {
            return 1;
        }
        int f = 1;
        for (int value = 1; value <= n; value++) {
            f *= value;
        }
            return f;
    }
}
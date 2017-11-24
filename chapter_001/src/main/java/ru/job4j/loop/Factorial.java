package ru.job4j.loop;

/**
 * Class для вычмсления факториала
 * @author     Mirat Rakhmanov
 * @since      24.11.2017
 * @version    2.0
 * Method calc принимает положительное целое число n, и возвращать рассчитанный факториал для этого числа
 * @param n
 * @return факториал n
 */

    public class Factorial {


    public int calc(int n) {
        int f = 1;
        for (int x = 1; x <= n; x++) {
            f *= x;
        }
            return f;
    }
}
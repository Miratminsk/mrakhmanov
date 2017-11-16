package ru.job4j.loop;

/**
 * Class для возвращения максимального числа
 * @author     Mirat Rakhmanov
 * @since      15.11.2017
 * @version    1.0
 * Method add вычислять сумму четныx чисел в диапазоне от start до finish;
 * @param start, finish
 * @return сумма четных чисел
 */

    public class Counter {

        public int add(int start, int finish) {
            int sum = 0;
            for (int value = start; value <= finish; value++) {
                if (value % 2 == 0) {
                    sum = value + sum;
                }
            }
            return sum;
        }
    }

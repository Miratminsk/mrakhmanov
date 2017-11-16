package ru.job4j.max;

/**
* Class для возвращения максимального числа
* @author     Mirat Rakhmanov
* @since      15.11.2017
* @version    1.0
* Method maxFromTwo возвращает максимальное число из 2х чисел
* Method max возвращает максимальное значение из 3х чисел
* @param value1, value2
* @return максимальное значение
*/

	public class Max {

    public int max(int first, int second, int third) {
        return this.maxFromTwo(this.maxFromTwo(first, second), this.maxFromTwo(second, third));
    }

    public int maxFromTwo(int value1, int value2) {
        return (value1 > value2) ? value1 : value2;
    }
}


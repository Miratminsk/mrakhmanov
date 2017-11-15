package ru.job4j.max;

/**
* Class для возвращения максимального числа
* @author     Mirat Rakhmanov
* @since      14.11.2017
* @version    1.0
* Method maxFromTwo возвращает максимальное число из 2х чисел
* Method max возвращает максимальное значение из 3х чисел
* @param value1, value2
* @return максимальное значение
*/

	public class Max {

    public int max(int first, int second, int third) {
        this.maxFromTwo(first, second);
        int maxValueFromFirstAndSecond = this.maxFromTwo(first, second);
        this.maxFromTwo(second, third);
        int maxValueFromSecondAndThird = this.maxFromTwo(second, third);
        return this.maxFromTwo(maxValueFromFirstAndSecond, maxValueFromSecondAndThird);
    }
    public int maxFromTwo(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }

    }
}

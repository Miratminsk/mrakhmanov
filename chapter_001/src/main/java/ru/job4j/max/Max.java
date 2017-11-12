package ru.job4j.max;

/**
* Class для возвращения максимального числа
* @author     Mirat Rakhmanov
* @since      09.11.2017
* @version    1.0
* Methods max возвращает максимальное число из first и second или число 0 если числа равны
* @param first, second
* @return максимальное значение или 0
*/

	public class Max {

    public int max(int first, int second) {
        int maximumValue = (first > second) ? first : second;
        return maximumValue;
    }
}

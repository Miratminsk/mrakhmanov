package ru.job4j.examone;

/**
 * Class для проверяющий, что словo находится в другом слове
 * @author     Mirat Rakhmanov
 * @since      25.12.2017
 * @version    1.0
 * Method contains проверяет, что словo находится в другом слове
 * @param String origin, String sub
 * @return возвращает true или false
 */

public class ExamOne {

    public boolean contains(String origin, String sub) {
        char[] charOrigin = origin.toCharArray();
        char[] charSub = sub.toCharArray();
        boolean result = false;
        int b = 0;
        for (int a = 0; a < charOrigin.length && b < charSub.length; a++) {
            if (Character.toLowerCase(charOrigin[a]) == Character.toLowerCase(charSub[b])) {
                b++;
            }
            if (b == charSub.length - 1) {
                result = true;
            }
        }
        return result;
    }
}
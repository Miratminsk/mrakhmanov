package ru.job4j.examone;

/**
 * Class для проверяющий, что словo находится в другом слове
 * @author     Mirat Rakhmanov
 * @since      14.12.2017
 * @version    1.0
 * Method contains проверяет, что словo находится в другом слове
 * @param String origin, String sub
 * @return возвращает true или false
 */

public class ExamOne {

    public boolean contains(String origin, String sub) {
        char[] charOrigin = origin.toCharArray();
        char[] charSub = sub.toCharArray();
        char[] charResult = new char[charSub.length];
        int b = 0;
        for (int a = 0; a < charOrigin.length; a++) {
            if (charSub[b] == charOrigin[a]) {
                charResult[b] = charSub[b];
                b++;
            }
            if (b == charSub.length || b < charSub.length) {
                String s1 = new String(charSub);
                String s2 = new String(charResult);
                if (s1.equals(s2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

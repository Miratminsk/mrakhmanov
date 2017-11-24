package ru.job4j.loop;

/**
 * Class для построения пирамиды в псевдографике
 * @author     Mirat Rakhmanov
 * @since      24.11.2017
 * @version    1.0
 * Method paint принимает положительное целое число h, и возвращать пирамиду в псевдографике
 * @param n
 * @return пирамидa в псевдографике
 */

public class Paint {

    public String piramid(int h) {
        StringBuilder builder = new StringBuilder();
        int l = ((h * 2) - 1);
        int m = h;
        int a = 1;
        int b = m;
        int e = m;
        int lanes = 1;
        int k = 1;
        while (lanes <= h) {
            if (k == 1) {
            if (a < b) {
                builder.append(" ");
                a++;
            }
            if (a >= b && a < m) {
                builder.append("^");
                a++;
            }
            if (a == m) {
                b--;
                a = 1;
                k = 2;
            }
            }
            if (k == 2) {
                if (m <= e) {
                    builder.append("^");
                    m++;
                }
                if (m > e && m <= l) {
                    builder.append(" ");
                    m++;
                }
                if (m > l) {
                    e++;
                    m = h;
                    builder.append(System.getProperty("line.separator"));
                    lanes++;
                    k = 1;
                }
            }
        }
            return builder.toString();
    }
}




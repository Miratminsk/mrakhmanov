package ru.job4j.loop;

/**
 * Class для построения пирамиды в псевдографике
 * @author     Mirat Rakhmanov
 * @since      24.11.2017
 * @version    2.0
 * Method paint принимает положительное целое число h, и возвращать пирамиду в псевдографике
 * @param n
 * @return пирамидa в псевдографике
 */

public class Paint {

    public String piramid(int h) {
        StringBuilder builder = new StringBuilder();
        for (int a = 0; a < h; a++) {
            for (int b = 0; b < h * 2; b++) {
                if (b > h - 2 - a && b < h + a) {
                    builder.append("^");
                } else if (b < h * 2 - 1) {
                    builder.append(" ");
                }
            }
            if (a < h - 1) {
                builder.append(System.getProperty("line.separator"));
            }
        }
        builder.append(System.getProperty("line.separator"));
        return builder.toString();
    }
}


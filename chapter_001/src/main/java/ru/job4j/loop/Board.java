package ru.job4j.loop;

/**
 * Class для "рисования" шахматной доски
 * @author     Mirat Rakhmanov
 * @since      16.11.2017
 * @version    1.0
 * Method paint должен рисовать шахматную доску из символов x и пробелов
 * Method append добавляет символы и строки в некоторый буфер StringBuilder-а
 * Method toString возвращает все добавленные в него символы и строки в одну строку.
 * @param width, height
 * @return шахматную доску согласно width, height
 */

    public class Board {

    public String paint(int width, int height) {
        StringBuilder builder = new StringBuilder();
        int lanes = 1;
        int n = 1;
        int value = 1;
        while (lanes <= height) {
                if (n % 2 != 0 && value <= width) {
                    builder.append("x");
                    n++;
                    value++;
                }
                if (n % 2 == 0 && value <= width) {
                    builder.append(" ");
                    n++;
                    value++;
                }
                if (value > width) {
                    builder.append(System.getProperty("line.separator"));
                    lanes++;
                    value = 1;
                }
            }
            return builder.toString();
        }
    }

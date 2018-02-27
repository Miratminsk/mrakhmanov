package ru.job4j.chess;

/**
 * @author      Mirat Rakhmanov
 * @since       26.02.2018
 * @version     1.0
 */

public abstract class Figure {
    int[] source;
    int[] dest;

    Figure(int[] source, int[] dest) {
        this.source = source;
        this.dest = dest;
    }
}

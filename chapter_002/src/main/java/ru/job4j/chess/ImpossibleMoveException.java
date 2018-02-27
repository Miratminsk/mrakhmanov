package ru.job4j.chess;

/**
 * @author      Mirat Rakhmanov
 * @since       26.02.2018
 * @version     1.0
 */

class OccupiedWayException extends Exception {

    public OccupiedWayException(String msg) {
        super(msg);
    }
}
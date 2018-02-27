package ru.job4j.chess;

/**
 * @author      Mirat Rakhmanov
 * @since       26.02.2018
 * @version     1.0
 */

    public interface InputFigure {

        int[] way(int[] source, int[] dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException;

        boolean move(int[] source, int[] dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException;
    }
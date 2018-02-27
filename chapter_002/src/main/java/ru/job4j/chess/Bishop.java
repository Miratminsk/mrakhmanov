package ru.job4j.chess;


/**
 * @author      Mirat Rakhmanov
 * @since       26.02.2018
 * @version     1.0
 */

public class Bishop implements InputFigure{

    public boolean move(int[] source, int[] dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        return true;
    }

    public int[] way(int[] source, int[] dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        boolean result = false;
        int[] figureWay = new int[16];
        int c = 0;
        figureWay[c++] = source[0];
        figureWay[c++] = source[1];
        int d = figureWay[1];
        if (dest[0] > source[0] && dest[1] > source[1] && c == 2) {
            for (int b = figureWay[0]; b <= dest[0]; b++) {
                figureWay[c++] = b + 1;
                figureWay[c++] = d + 1;
                d++;
                if (figureWay[c - 2] == dest[0] && figureWay[c - 1] == dest[1]) {
                    result = true;
                    break;
                }
            }
        }
        if (dest[0] < source[0] && dest[1] < source[1] && !result && c == 2) {
            for (int b = figureWay[0]; b >= dest[0]; b--) {
                    figureWay[c++] = b - 1;
                    figureWay[c++] = d - 1;
                    d--;
                if (figureWay[c - 2] == dest[0] && figureWay[c - 1] == dest[1]) {
                    result = true;
                    break;
                }
            }
        }
        if (dest[0] < source[0] && dest[1] > source[1] && !result && c == 2) {
            for (int b = figureWay[0]; b >= dest[0]; b--) {
                    figureWay[c++] = b - 1;
                    figureWay[c++] = d + 1;
                    d++;
                    if (figureWay[c - 2] == dest[0] && figureWay[c - 1] == dest[1]) {
                        result = true;
                        break;
                    }
                }
            }
        if (dest[0] > source[0] && dest[1] < source[1] && !result && c == 2) {
            for (int b = figureWay[0]; b <= dest[0]; b++) {
                    figureWay[c++] = b + 1;
                    figureWay[c++] = d - 1;
                    d--;
                    if (figureWay[c - 2] == dest[0] && figureWay[c - 1] == dest[1]) {
                        result = true;
                        break;
                    }
                }
            }
        if(!result) {
            throw new ImpossibleMoveException("Impossible Move Exception");
        }
        return figureWay;
    }
}

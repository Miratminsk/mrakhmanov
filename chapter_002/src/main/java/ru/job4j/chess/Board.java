package ru.job4j.chess;


/**
 * @author      Mirat Rakhmanov
 * @since       26.02.2018
 * @version     1.0
 */

public class Board implements InputFigure {
    private final InputFigure inputFigure;

    int[] figures = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};

    Board(InputFigure inputFigure) {
        this.inputFigure = inputFigure;
    }

    public Figure add(Figure figure) {
        return null;
    }

    public void figureCopy(int[] source, int[] dest) {
        for (int a = 0; a < figures.length; a++) {
            if (figures[a++] == source[0]) {
                if (figures[a] == source[1]) {
                    figures[a] = dest[1];
                    figures[a - 1] = dest[0];
                }
            }
        }
    }

    @Override
    public int[] way(int[] source, int[] dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        return this.inputFigure.way(source, dest);
    }

    public boolean move(int[] source, int[] dest) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        boolean result = false;
        do {
            try {
                for (int a = 0; a <= figures.length; a++) {
                    if (a == figures.length) {
                        throw new FigureNotFoundException("Figure Not Found Exception");
                    }
                    if (figures[a++] == source[0]) {
                        if (figures[a] == source[1]) {
                            break;
                        }
                    }
                }
            } catch (FigureNotFoundException fnf) {
                System.out.println("Figure Not Found Exception");
                result = true;
            }
            if (!result) {
                try {
                    if (dest[0] > 7 || dest[0] < 0 || dest[1] > 7 || dest[1] < 0) {
                        throw new ImpossibleMoveException("Impossible Move Exception");
                    }
                    this.way(source, dest);
                } catch (ImpossibleMoveException ime) {
                    System.out.println("Impossible Move Exception");
                    result = true;
                }
            }
            if (!result) {
                int d = 0;
                int[] res = this.way(source, dest);
                try {
                    for (int a = 2; a <= figures.length && d < figures.length; a = a + 2) {
                        if (figures[d] == res[a] && figures[d] != 9 && res[a] != 9) {
                            if (figures[d + 1] == res[a + 1]){
                                if (source[1] != figures[d + 1] && source[0] != figures[d]) {
                                    result = true;
                                    break;
                                }
                            }
                        }
                        if (figures[d] != res[a]) {
                            result = false;
                            if (a == figures.length) {
                                a = 0;
                                d = d + 2;
                            }
                        }
                    }
                    if (result) {
                        throw new OccupiedWayException("Occupied Way Exception");
                    }
                } catch (OccupiedWayException owe) {
                    System.out.println("Occupied Way Exception");
                    result = true;
                }
            }
            if (!result) {
                this.figureCopy(source, dest);
                result = true;
            }
        } while (!result);
        return result;
    }
}


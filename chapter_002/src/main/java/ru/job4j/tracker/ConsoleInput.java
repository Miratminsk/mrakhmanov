package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс для реализации Item в коде
 * @param       String question
 * @author      Mirat Rakhmanov
 * @since       23.01.2018
 * @version     1.0
 * @return      nextLine
 */

    public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    public int ask(String question, int[] range) {
        int keys = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range)
            if (value == keys) {
                exist = true;
                break;
            }
            if (exist) {
                return keys;
            } else {
                throw new MenuOutException("Out of menu range");
            }
        }
    }

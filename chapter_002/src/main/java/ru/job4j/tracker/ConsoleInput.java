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
}
package ru.job4j.tracker;

/**
 * Класс для реализации Item в коде
 * @param       String answers, String question
 * @author      Mirat Rakhmanov
 * @since       24.01.2018
 * @version     1.0
 * @return      String answers
 */

    public class StubInput implements Input {
        private String[] answers;
        private int position = 0;

        public StubInput(String[] answers) {
            this.answers = answers;
        }

        public String ask(String question) {
            return answers[position++];
        }
}
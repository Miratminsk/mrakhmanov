package ru.job4j.tracker;

/**
 * @author      Mirat Rakhmanov
 * @since       03.02.2018
 * @version     1.0
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

    public int ask(String question, int[] range) {
        int keys = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == keys) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return keys;
        } else {
            throw new MenuOutException("Out of menu range");
        }
    }
}
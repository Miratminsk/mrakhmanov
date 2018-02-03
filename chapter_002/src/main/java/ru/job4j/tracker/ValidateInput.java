package ru.job4j.tracker;

/**
 * @author      Mirat Rakhmanov
 * @since       03.02.2018
 * @version     1.0
 */

public class ValidateInput implements Input {

    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select keys from 0 to 5 ");
            } catch (NumberFormatException nfe) {
                System.out.println("Please NUMBERS from 0 to 5 ");
            }
        } while (invalid);
                return value;
    }
}
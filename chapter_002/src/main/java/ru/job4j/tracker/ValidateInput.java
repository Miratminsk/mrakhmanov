package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {

    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select keys from 0 to 5");
            } catch (NumberFormatException nfe) {
                System.out.println("Please NUMBERS from 0 to 5");
            }
        } while (invalid);
                return value;
    }
}
package ru.job4j.tracker;

/**
 * Класс для реализации StartUI в коде
 * @author      Mirat Rakhmanov
 * @since       23.01.2018
 * @version     1.0
 * @return      Возвращает результат обработанный в классе Tracker
 */

public class StartUI {
    private final Input input;

    public StartUI(Input input) {
        this.input = input;
    }

    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();
        do {
            menu.show();
            System.out.println("If you want stop action, please type; STOP");
            menu.select(input.ask("Please select: ", menu.menuValue()));
        } while (!"Y".equals(this.input.ask("EXIT Y/N: ")));
    }

    public static void main(String[] args) {
        Input input = new ValidateInput();
        new StartUI(input).init();
    }

}
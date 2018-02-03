package ru.job4j.tracker;

/**
 * @author      Mirat Rakhmanov
 * @since       03.02.2018
 * @version     1.0
 */

public class StartUI {
    private final Input input;
    final Tracker tracker;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();
        do {
            menu.show();
            System.out.println("If you want stop action, please type; STOP");
            menu.select(input.ask("Please select:", menu.menuValue()));
        } while (!"Y".equals(this.input.ask("EXIT Y/N: ")));
    }

    public static void main(String[] args) {
       new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }

}
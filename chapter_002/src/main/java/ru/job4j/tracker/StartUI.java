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
    private final int EXT = 6;

    public StartUI(Input input) {
        this.input = input;
    }

    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();
        boolean exit = false;
        while (!exit) {
            menu.show();
            System.out.println("6. Exit.");
            System.out.println("If you want back to the main menu, please type: EXT");
            int keys = Integer.valueOf(input.ask("Please select: "));
            if (keys == EXT) {
                 exit = true;
            } else {
                menu.select(keys);
            }
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }

}
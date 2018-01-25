package ru.job4j.tracker;

import ru.job4j.models.Item;
import java.util.*;
import java.util.ArrayList;

/**
 * Класс для реализации StartUI в коде
 * @author      Mirat Rakhmanov
 * @since       23.01.2018
 * @version     1.0
 * @return      Возвращает результат обработанный в классе Tracker
 */

public class StartUI {
    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDBYID = "4";
    private static final String FINDBYNAME = "5";
    private static final String EXIT = "6";
    private static final String Y = "EXT";
    private final Input input;
    private final Tracker tracker;

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by id.");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit program");
        System.out.println("If you want back to the main menu, please type: EXT");
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Enter the menu item: ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showItem();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDBYID.equals(answer)) {
                this.findByIdItem();
            } else if (FINDBYNAME.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    private void createItem() {
        boolean flag = false;
        while (!flag) {
            System.out.println("---------------Add a new application---------------------------------------");
            String name = this.input.ask("Enter the name of the application: ");
            if (Y.equals(name)) {
                break;
            }
            String description = this.input.ask("Enter the description of the application: ");
            if (Y.equals(description)) {
                break;
            }
            Item item = new Item(name, description);
            this.tracker.add(item);
            System.out.println("---------------Created a new application with ID: " + item.getId() + "---------------");
            flag = true;
        }
    }

    private void showItem() {
        System.out.println("---------------The following applications exist in the database: -------------------");
        List<Item> list = new ArrayList<>(Arrays.asList(this.tracker.findAll()));
        for (int x = 0; x < list.size(); x++) {
            System.out.println(x + 1 + ". " + "ID: " + list.get(x).getId() + "," + " Name: " + list.get(x).getName() + "," + " Description: " + list.get(x).getDescription() + ".");
        }
    }

    private void editItem() {
        boolean flag = false;
        while (!flag) {
            System.out.println("---------------Editing an application-----------------------------------------");
            String name = this.input.ask("Enter the name of the new application: ");
            if (Y.equals(name)) {
                break;
            }
            String description = this.input.ask("Enter the description of the new application: ");
            if (Y.equals(description)) {
                break;
            }
            String id = this.input.ask("Enter the ID of the application to be replaced: ");
            if (Y.equals(id)) {
                break;
            }
            Item item = new Item(name, description);
            String resultId = this.tracker.findById(id).getId();
            String resultDescription = this.tracker.findById(id).getDescription();
            String resultName = this.tracker.findById(id).getName();
            this.tracker.replace(id, item);
            List<Item> list = new ArrayList<>(Arrays.asList(item));
            System.out.println("---------------Application edited-----------------------------------");
            System.out.println("---------------Was:  " + "ID: " + resultId + "," + " Name: " + resultName + "," + " Description: " + resultDescription + ".");
            System.out.println("---------------Now: " + "ID: " + list.get(id.indexOf(id)).getId() + "," + " Name: " + list.get(id.indexOf(id)).getName() + "," + " Description: " + list.get(id.indexOf(id)).getDescription() + ".");
            flag = true;
        }
    }

    private void deleteItem() {
        boolean flag = false;
        while (!flag) {
            System.out.println("---------------Delete---------------");
            String id = this.input.ask("Enter the ID of the application you want to delete: ");
            if (Y.equals(id)) {
                break;
            }
            this.tracker.delete(id);
            System.out.println("---------------Application deleted---------------");
            flag = true;
        }
    }

    private void findByIdItem() {
        boolean flag = false;
        while (!flag) {
            System.out.println("---------------Find an application by ID---------------");
            String id = this.input.ask("Enter the ID of the application you want to find: ");
            if (Y.equals(id)) {
                break;
            }
            System.out.println("---------------Search completed--------------------");
            this.tracker.findById(id);
            List<Item> list = new ArrayList<>(Arrays.asList(this.tracker.findById(id)));
            System.out.println("ID: " + list.get(id.indexOf(id)).getId() + "," + " Name: " + list.get(id.indexOf(id)).getName() + "," + " Description: " + list.get(id.indexOf(id)).getDescription() + ".");
            flag = true;
        }
    }

    private void findByName() {
        boolean flag = false;
        while (!flag) {
            System.out.println("---------------Find matches by name-------------");
            String key = this.input.ask("Enter ID: ");
            if (Y.equals(key)) {
                break;
            }
            List<Item> list = new ArrayList<>(Arrays.asList(this.tracker.findByName(key)));

            System.out.println("---------------Search completed---------------");
            for (int x = 0; x < list.size(); x++) {
                if (list.get(x) != null) {
                    System.out.println(x + 1 + ". " + "ID: " + list.get(x).getId() + "," + " Name: " + list.get(x).getName() + "," + " Description: " + list.get(x).getDescription() + ".");
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
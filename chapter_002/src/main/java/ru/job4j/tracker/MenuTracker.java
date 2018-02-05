package ru.job4j.tracker;

import ru.job4j.models.Item;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author      Mirat Rakhmanov
 * @since       04.02.2018
 * @version     1.0
 */

class EditItem extends BaseAction {
    private static final String Y = "STOP";

    public EditItem(int keys, String name) {
        super(keys, name);
    }

    public void execute(Input input, Tracker tracker) {
        boolean flag = false;
        while (!flag) {
            System.out.println("---------------Add a new application---------------------------------------------------");
            String id = input.ask("Enter the ID of the application to be replaced: ");
            if (Y.equals(id)) {
                break;
            }
            String name = input.ask("Enter the name of the application: ");
            if (Y.equals(name)) {
                break;
            }
            String description = input.ask("Enter the description of the application: ");
            if (Y.equals(description)) {
                break;
            }
            Item item = new Item(name, description);
            tracker.replace(id, item);
            System.out.println("Application has been changed");
        }
    }
}

class FindByName extends BaseAction {
    private static final String Y = "STOP";

    public FindByName(int keys, String name) {
        super(keys, name);
    }

    public void execute(Input input, Tracker tracker) {
        boolean flag = false;
        while (!flag) {
            System.out.println("---------------Find matches by name-------------");
            String key = input.ask("Enter ID: ");
            if (Y.equals(key)) {
                break;
            }
            List<Item> list = new ArrayList<>(Arrays.asList(tracker.findByName(key)));
            System.out.println("---------------Search completed---------------");
            for (int x = 0; x < list.size(); x++) {
                if (list.get(x) != null) {
                    System.out.println(x + 1 + ". " + "ID: " + list.get(x).getId() + "," + " Name: " + list.get(x).getName() + "," + " Description: " + list.get(x).getDescription() + ".");
                }
            }
        }
    }
}

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    public UserAction[] actions = new UserAction[6];
    private static final String Y = "STOP";
    private int position = 0;
    private int position1 = 0;
    private int keys = 0;
    private String[] names = new String[]{"Create new item", "Show items", "Edit item", "Delete item", "Find by id item", "Find by name"};

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[position++] = this.new CreateItem(keys++, names[position1++]);
        this.actions[position++] = this.new ShowItem(keys++, names[position1++]);
        this.actions[position++] = new EditItem(keys++, names[position1++]);
        this.actions[position++] = this.new DeleteItem(keys++, names[position1++]);
        this.actions[position++] = new MenuTracker.FindByIdItem(keys++, names[position1++]);
        this.actions[position++] = new FindByName(keys++, names[position1++]);
    }

    public int[] menuValue() {
        int a = actions.length;
        int[] rang = new int[actions.length + 1];
        for (int x = 0; x <= a; x++) {
            rang[x] = x;
        }
        return rang;
    }


    public void select(int keys) {
        this.actions[keys].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    class CreateItem extends BaseAction {

        public CreateItem(int keys, String name) {
            super(keys, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            boolean flag = false;
            while (!flag) {
                System.out.println("-------------------------Add a new application-------------------------");
                String name = input.ask("Enter the name of the application: ");
                if (Y.equals(name)) {
                    break;
                }
                String description = input.ask("Enter the description of the application: ");
                if (Y.equals(description)) {
                    break;
                }
                Item item = new Item(name, description);
                tracker.add(item);
                System.out.println(String.format("%s: %s: %s, %s: %s, %s: %s", "Application has been created", "ID", item.getId(), "NAME", item.getName(), "DESCRIPTION", item.getDescription()));
                flag = true;
            }
        }
    }

    class ShowItem extends BaseAction {

        public ShowItem(int keys, String name) {
            super(keys, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            List<Item> list = new ArrayList<>(Arrays.asList(tracker.findAll()));
            System.out.println("---------------The following applications exist in the database: -------------------");
            for (int x = 0; x < list.size(); x++) {
                System.out.println(x + 1 + ". " + "ID: " + list.get(x).getId() + "," + " Name: " + list.get(x).getName() + "," + " Description: " + list.get(x).getDescription() + ".");
            }
        }
    }

    class FindByIdItem extends BaseAction {

        public FindByIdItem(int keys, String name) {
            super(keys, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            boolean flag = false;
            while (!flag) {
                System.out.println("---------------Find an application by ID---------------");
                String id = input.ask("Enter the ID of the application you want to find: ");
                if (Y.equals(id)) {
                    break;
                }
                System.out.println("---------------Search completed--------------------");
                tracker.findById(id);
                List<Item> list = new ArrayList<>(Arrays.asList(tracker.findById(id)));
                System.out.println("ID: " + list.get(id.indexOf(id)).getId() + "," + " Name: " + list.get(id.indexOf(id)).getName() + "," + " Description: " + list.get(id.indexOf(id)).getDescription() + ".");
                flag = true;
            }
        }
    }

            class DeleteItem extends BaseAction {

                public DeleteItem(int keys, String name) {
                    super(keys, name);
                }

                @Override
                public void execute(Input input, Tracker tracker) {
                    boolean flag = false;
                    while (!flag) {
                        System.out.println("---------------Delete---------------");
                        String id = input.ask("Enter the ID of the application you want to delete: ");
                        if (Y.equals(id)) {
                            break;
                        }
                        tracker.delete(id);
                        System.out.println("---------------Application has been deleted---------------");
                        flag = true;
                    }
                }
            }
        }



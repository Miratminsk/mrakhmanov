package ru.job4j.tracker;

import ru.job4j.models.Item;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class EditItem implements UserAction {
    private static final String Y = "EXT";

    public int keys() {
        return 2;
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

    public String info() {
        return String.format("%s. %s", this.keys(),"Edit a application");
    }

}

class FindByName implements UserAction {
    private static final String Y = "EXT";

    public int keys() {
        return 5;
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

    public String info () {
        return String.format("%s. %s", this.keys(), "Find by name.");
    }
}

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[6];
    private static final String Y = "EXT";

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[0] = this.new CreateItem();
        this.actions[1] = new MenuTracker.ShowItem();
        this.actions[2] = new EditItem();
        this.actions[3] = this.new DeleteItem();
        this.actions[4] = new MenuTracker.FindByIdItem();
        this.actions[5] = new FindByName();
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

    private class CreateItem implements UserAction {
        public int keys() {
            return 0;
        }

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

        public String info() {
            return String.format("%s. %s", this.keys(), "Create the new application");
        }
    }

    private static class ShowItem implements UserAction {
        public int keys() {
            return 1;
        }

        public void execute(Input input, Tracker tracker) {
                List<Item> list = new ArrayList<>(Arrays.asList(tracker.findAll()));
                System.out.println("---------------The following applications exist in the database: -------------------");
                for (int x = 0; x < list.size(); x++) {
                    System.out.println(x + 1 + ". " + "ID: " + list.get(x).getId() + "," + " Name: " + list.get(x).getName() + "," + " Description: " + list.get(x).getDescription() + ".");
                }
            }

        public String info() {
            return String.format("%s. %s", this.keys(), "Show all items in database");
        }
    }

    private static class FindByIdItem implements UserAction {
        public int keys() {
            return 4;
        }

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

        public String info() {
            return String.format("%s. %s", this.keys(), "Find By ID.");
        }
    }

    private class  DeleteItem implements UserAction {
        public int keys() {
            return 3;
        }

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

        public String info() {
            return String.format("%s. %s", this.keys(), "Delete item.");
        }
    }
}

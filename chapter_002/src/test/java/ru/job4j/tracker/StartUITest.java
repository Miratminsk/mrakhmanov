package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.models.Item;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      25.01.2018
 * @version    2.0
 */

public class StartUITest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final Tracker tracker = new Tracker();
    private final String name = "test name";
    private final String description = "test description";
    private final String nameTwo = "test name two";
    private final String descriptionTwo = "test description two";
    private final Item item = tracker.add(new Item(name, description));
    private final Item itemTwo = tracker.add(new Item(nameTwo, descriptionTwo));

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));

    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenUserShowItem() {
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                        .append("Menu.")
                        .append(System.lineSeparator())
                        .append("0. Add new item.")
                        .append(System.lineSeparator())
                        .append("1. Show all items.")
                        .append(System.lineSeparator())
                        .append("2. Edit item.")
                        .append(System.lineSeparator())
                        .append("3. Delete item.")
                        .append(System.lineSeparator())
                        .append("4. Find item by id.")
                        .append(System.lineSeparator())
                        .append("5. Find items by name")
                        .append(System.lineSeparator())
                        .append("6. Exit program")
                        .append(System.lineSeparator())
                        .append("If you want back to the main menu, please type: EXT")
                        .append(System.lineSeparator())
                        .append("---------------The following applications exist in the database: -------------------")
                        .append(System.lineSeparator())
                        .append("1. ID: " + item.getId() + ", Name: test name, Description: test description.")
                        .append(System.lineSeparator())
                        .append("2. ID: " + itemTwo.getId() + ", Name: test name two, Description: test description two.")
                        .append(System.lineSeparator())
                        .append("Menu.")
                        .append(System.lineSeparator())
                        .append("0. Add new item.")
                        .append(System.lineSeparator())
                        .append("1. Show all items.")
                        .append(System.lineSeparator())
                        .append("2. Edit item.")
                        .append(System.lineSeparator())
                        .append("3. Delete item.")
                        .append(System.lineSeparator())
                        .append("4. Find item by id.")
                        .append(System.lineSeparator())
                        .append("5. Find items by name")
                        .append(System.lineSeparator())
                        .append("6. Exit program")
                        .append(System.lineSeparator())
                        .append("If you want back to the main menu, please type: EXT")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }

    @Test
    public void whenUserFindById() {
        Input input = new StubInput(new String[]{"4", itemTwo.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                        .append("Menu.")
                        .append(System.lineSeparator())
                        .append("0. Add new item.")
                        .append(System.lineSeparator())
                        .append("1. Show all items.")
                        .append(System.lineSeparator())
                        .append("2. Edit item.")
                        .append(System.lineSeparator())
                        .append("3. Delete item.")
                        .append(System.lineSeparator())
                        .append("4. Find item by id.")
                        .append(System.lineSeparator())
                        .append("5. Find items by name")
                        .append(System.lineSeparator())
                        .append("6. Exit program")
                        .append(System.lineSeparator())
                        .append("If you want back to the main menu, please type: EXT")
                        .append(System.lineSeparator())
                        .append("---------------Find an application by ID---------------")
                        .append(System.lineSeparator())
                        .append("---------------Search completed--------------------")
                        .append(System.lineSeparator())
                        .append("ID: " + itemTwo.getId() + ", Name: test name two, Description: test description two.")
                        .append(System.lineSeparator())
                        .append("Menu.")
                        .append(System.lineSeparator())
                        .append("0. Add new item.")
                        .append(System.lineSeparator())
                        .append("1. Show all items.")
                        .append(System.lineSeparator())
                        .append("2. Edit item.")
                        .append(System.lineSeparator())
                        .append("3. Delete item.")
                        .append(System.lineSeparator())
                        .append("4. Find item by id.")
                        .append(System.lineSeparator())
                        .append("5. Find items by name")
                        .append(System.lineSeparator())
                        .append("6. Exit program")
                        .append(System.lineSeparator())
                        .append("If you want back to the main menu, please type: EXT")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }

    @Test
    public void whenUserFindByNama() {
        Tracker tracker = new Tracker();
        String name = "mirat";
        String description = "male";
        String nameTwo = "Anna";
        String descriptionTwo = "Female";
        String nameThree = "MIRAT";
        String descriptionThree = "MALE";
        Item item = tracker.add(new Item(name, description));
        Item itemTwo = tracker.add(new Item(nameTwo, descriptionTwo));
        Item itemThree = tracker.add(new Item(nameThree, descriptionThree));
        Input input = new StubInput(new String[]{"5", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                        .append("Menu.")
                        .append(System.lineSeparator())
                        .append("0. Add new item.")
                        .append(System.lineSeparator())
                        .append("1. Show all items.")
                        .append(System.lineSeparator())
                        .append("2. Edit item.")
                        .append(System.lineSeparator())
                        .append("3. Delete item.")
                        .append(System.lineSeparator())
                        .append("4. Find item by id.")
                        .append(System.lineSeparator())
                        .append("5. Find items by name")
                        .append(System.lineSeparator())
                        .append("6. Exit program")
                        .append(System.lineSeparator())
                        .append("If you want back to the main menu, please type: EXT")
                        .append(System.lineSeparator())
                        .append("---------------Find matches by name-------------")
                        .append(System.lineSeparator())
                        .append("---------------Search completed---------------")
                        .append(System.lineSeparator())
                        .append("1. ID: " + itemThree.getId() + ", Name: MIRAT, Description: MALE.")
                        .append(System.lineSeparator())
                        .append("Menu.")
                        .append(System.lineSeparator())
                        .append("0. Add new item.")
                        .append(System.lineSeparator())
                        .append("1. Show all items.")
                        .append(System.lineSeparator())
                        .append("2. Edit item.")
                        .append(System.lineSeparator())
                        .append("3. Delete item.")
                        .append(System.lineSeparator())
                        .append("4. Find item by id.")
                        .append(System.lineSeparator())
                        .append("5. Find items by name")
                        .append(System.lineSeparator())
                        .append("6. Exit program")
                        .append(System.lineSeparator())
                        .append("If you want back to the main menu, please type: EXT")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }

    @Test
    public void whenUserAddItem() {
        Input input = new StubInput(new String[]{"0", "test name", "test description", "0", "test name two", "test description two", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
        assertThat(tracker.findAll()[0].getDescription(), is("test description"));
        assertThat(tracker.findAll()[1].getName(), is("test name two"));
        assertThat(tracker.findAll()[1].getDescription(), is("test description two"));
    }

    @Test
    public void whenUserEditItem() {
        Tracker tracker = new Tracker();
        String name = "old name";
        String description = "old description";
        Item item = tracker.add(new Item(name, description));
        assertThat(tracker.findAll()[0].getName(), is("old name"));
        assertThat(tracker.findAll()[0].getDescription(), is("old description"));
        Input input = new StubInput(new String[]{"0", "name", "description", "2", "new name", "new description", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("new name"));
        assertThat(tracker.findAll()[0].getDescription(), is("new description"));
        assertThat(tracker.findAll()[1].getName(), is("name"));
        assertThat(tracker.findAll()[1].getDescription(), is("description"));

    }

    @Test
    public void whenUserDeleteItem() {
        Tracker tracker = new Tracker();
        String name = "Phil";
        String description = "Male";
        Item item = tracker.add(new Item(name, description));
        assertThat(tracker.findAll()[0].getName(), is("Phil"));
        assertThat(tracker.findAll()[0].getDescription(), is("Male"));
        Input input = new StubInput(new String[]{"0", "Mirat", "Male", "0", "Anna", "Female", "3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("Mirat"));
        assertThat(tracker.findAll()[0].getDescription(), is("Male"));
        assertThat(tracker.findAll()[1].getName(), is("Anna"));
        assertThat(tracker.findAll()[1].getDescription(), is("Female"));
    }

    @Test
    public void whenUserBackToTheMainMenuByExt() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "Phil", "Male", "0", "Mirat", "EXT", "0", "Anna", "Female", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("Phil"));
        assertThat(tracker.findAll()[0].getDescription(), is("Male"));
        assertThat(tracker.findAll()[1].getName(), is("Anna"));
        assertThat(tracker.findAll()[1].getDescription(), is("Female"));
    }
}
package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.models.Item;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      24.01.2018
 * @version    1.0
 */

public class StartUITest {

    @Test
    public void whenUserAddItem() {
        Tracker tracker = new Tracker();
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
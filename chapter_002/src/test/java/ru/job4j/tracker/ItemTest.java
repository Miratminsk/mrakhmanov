package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.models.Item;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author     Mirat Rakhmanov
 * @since      18.01.2018
 * @version    1.0
 */

public class ItemTest {

        @Test
        public void whenTestAdd() {
            Tracker tracker = new Tracker();
            Item previous = new Item("test1", "testDescription1", 123L);
            tracker.add(previous);
            Item last = new Item("Mirat", "Rakhmanov", 1988L);
            tracker.add(last);
            tracker.findAll();
            assertThat(tracker.findById(previous.getId()).getName(), is("test1"));
            assertThat(tracker.findById(last.getId()).getName(), is("Mirat"));
            assertThat(tracker.findAll().length, is(2));
        }

        @Test
        public void whenTestReplace() {
            Tracker tracker = new Tracker();
            Item previous = new Item("test1", "testDescription1", 123L);
            tracker.add(previous);
            Item last = new Item("Mirat", "Rakhmnov", 1988L);
            tracker.replace(previous.getId(), last);
            assertThat(tracker.findById(last.getId()).getName(), is("Mirat"));
            assertThat(tracker.findAll().length, is(1));
        }

        @Test
        public void whenTestDelete() {
            Tracker tracker = new Tracker();
            Item previous = new Item("test1", "testDescription1", 123L);
            tracker.add(previous);
            Item next = new Item("test2", "testDescription2", 321L);
            tracker.add(next);
            Item last = new Item("Mirat", "Rakhmnov", 1988L);
            tracker.add(last);
            assertThat(tracker.findAll().length, is(3));
            assertThat(tracker.findById(previous.getId()).getName(), is("test1"));
            assertThat(tracker.findById(next.getId()).getName(), is("test2"));
            assertThat(tracker.findById(last.getId()).getName(), is("Mirat"));
            tracker.delete(next.getId());
            assertThat(tracker.findAll().length, is(2));
            assertThat(tracker.findById(previous.getId()).getName(), is("test1"));
            assertThat(tracker.findById(last.getId()).getName(), is("Mirat"));
        }

        @Test
        public void whenTestFindAll() {
            //Item[] items = new Item[10]; - для теста используется следующее значение
            Tracker tracker = new Tracker();
            Item one = new Item("Anna", "testDescription1", 123L);
            tracker.add(one);
            Item two = new Item("test2", "testDescription2", 321L);
            tracker.add(two);
            Item[] expectArray = {null, null, null, null, null, null, null, null, null, null};
            assertThat(tracker.findByName(one.getId()), is(expectArray));
            assertThat(tracker.findByName(one.getId()).length, is(10));
            Item[] expectArrayTwo = {one, two};
            assertThat(tracker.findAll(), is(expectArrayTwo));
            assertThat(tracker.findAll().length, is(2));
        }

        @Test
        public void whenTestFindById() {
            Tracker tracker = new Tracker();
            Item one = new Item("Anna", "testDescription1", 123L);
            tracker.add(one);
            Item two = new Item("test2", "testDescription2", 321L);
            tracker.add(two);
            Item three = new Item("Anna", "ExOne", 1988L);
            assertThat(tracker.findById(one.getId()), is(one));
            assertThat(tracker.findById(three.getId()), is(nullValue()));
        }

        @Test
        public void whenTestFindByName() {
            //Item[] items = new Item[10]; - для теста используется следующее значение
            Tracker tracker = new Tracker();
            Item one = new Item("Anna", "testDescription1", 123L);
            tracker.add(one);
            Item two = new Item("test2", "testDescription2", 321L);
            tracker.add(two);
            Item three = new Item("Anna", "ExOne", 1988L);
            tracker.add(three);
            Item four = new Item("Anna", "ExTwo", 1986L);
            tracker.add(four);
            Item five = new Item("Mirat", "Rakhmnov", 1988L);
            tracker.add(five);
            Item six = new Item("Anna", "ExThree", 1986L);
            tracker.add(six);
            Item seven = new Item("Anna", "ExThree", 1986L);
            tracker.add(seven);
            Item[] expectArray = {three, four, six, seven, null, null, null, null, null, null};
            tracker.findByName(one.getId());
            assertThat(tracker.findByName(one.getId()), is(expectArray));
        }
        @Test
        public void whenTestGenerateId() {
            Tracker tracker = new Tracker();
            Item one = new Item("Anna", "testDescription1", 123L);
            tracker.add(one);
            Item two = new Item("test2", "testDescription2", 321L);
            tracker.add(two);
            Item three = new Item("Anna", "ExOne", 1988L);
            tracker.add(three);
            String idOne = tracker.generateId();
            String idTwo = tracker.generateId();
            String idThree = tracker.generateId();
            assertFalse(idOne.equals(idTwo));
            assertFalse(idTwo.equals(idThree));
    }
}
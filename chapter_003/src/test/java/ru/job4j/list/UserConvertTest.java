package ru.job4j.list;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {

    @Test
    public void whenCompareAll() {
        UserConvert base = new UserConvert();
        List<User> list = new ArrayList<>();
        User user = new User(1, "Mirat", "Chicago");
        User userTwo = new User(2, "Anna", "Minsk");
        User userThree = new User(3, "Alex", "Berlin");
        list.add(user);
        list.add(userTwo);
        list.add(userThree);
        String result = base.process(list).values().toString();
        String expect = list.toString();
        assertThat(result, is(expect));
    }

    @Test
    public void whenCompareCity() {
        UserConvert base = new UserConvert();
        List<User> list = new ArrayList<>();
        User user = new User(1, "Mirat", "Chicago");
        User userTwo = new User(2, "Anna", "Minsk");
        User userThree = new User(3, "Alex", "Berlin");
        list.add(user);
        list.add(userTwo);
        list.add(userThree);
        String result = base.process(list).get(1).city;
        String expect = list.get(0).city;
        assertThat(result, is(expect));
    }
}

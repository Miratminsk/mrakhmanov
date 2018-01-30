package ru.job4j.tracker;

public interface UserAction {

    int keys();

    void execute(Input input, Tracker tracker);

    String info();
}
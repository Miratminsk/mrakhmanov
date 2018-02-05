package ru.job4j.tracker;

/**
 * @author      Mirat Rakhmanov
 * @since       04.02.2018
 * @version     1.0
 */

public abstract class BaseAction implements UserAction {
    private int keys;
    private final String name;

    protected BaseAction(final int keys, final String name) {
        this.keys = keys;
        this.name = name;
    }

    @Override
    public int keys() {
        return this.keys;
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.keys, this.name);
    }
}
package ru.job4j.models;

/**
 * Класс для реализации Item в коде
 * @param       String id, String name, String description, long create
 * @author      Mirat Rakhmanov
 * @since       18.01.2018
 * @version     1.0
 * @return      String id, String name, String description, long create
 */

public class Item {
    private String id;
    private String name;
    private String description;
    private long create;

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
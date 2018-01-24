package ru.job4j.tracker;

import ru.job4j.models.*;
import java.util.*;


/**
 * Класс для реализации Tracker в коде
 * @param       Item[] items, int position, Random, String id, Item item, String key
 * @author      Mirat Rakhmanov
 * @since       23.01.2018
 * @version     1.0
 * @return      добавление заявок - public Item add(Item item), редактирование заявок - public void replace(String id, Item item), удаление заявок - public void delete(String id), получение списка всех заявок - public Item[] findAll(), получение списка по имени - public Item[] findByName(String key), получение заявки по id - public Item findById(String id);
 */

public class Tracker {
    public Item[] items = new Item[10];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }

    public void replace(String id, Item item) {
        item.setId(this.generateId());
        for (int a = 0; a <= items.length; a++) {
            if (items[a].getId().equals(id)) {
                items[a] = item;
                break;
            }
        }
    }

    public void delete(String id) {
        Item[] newItems = items;
        for (int a = 0; a < newItems.length; a++) {
            if (newItems[a].getId().equals(id)) {
                System.arraycopy(items, a + 1, newItems, a, items.length - 1 - a);
                break;
            }
        }
    }

    public Item[] findAll() {
        Item[] newItems = items;
        Item[] resItems;
        List<Item> list = new LinkedList<>(Arrays.asList(newItems));
        list.removeIf(Objects :: isNull);
        resItems = list.toArray(new Item[list.size()]);
        return resItems;
    }

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] newItems = items;
        Item[] resItems = new Item[newItems.length];
        final String result = this.findById(key).getName();
        int x = 0;
        for (int a = 0; a < items.length - 1; a++) {
            if (newItems[a] != null && !newItems[a].getId().equals(key) && newItems[a].getName().equalsIgnoreCase(result)) {
                resItems[x] = newItems[a];
                x++;
            }
        }
        return resItems;
    }

    String generateId() {
        String key = String.valueOf(System.currentTimeMillis() + RN.nextInt());
        return key;
    }
}
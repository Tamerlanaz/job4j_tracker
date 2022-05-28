package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.size);
    }

    public Item[] findByName(String key) {
        int length = 0;
        Item[] result = new Item[size];
        for (int i = 0; i < size; i++) {
            if (this.items[i].getName().equals(key)) {
                result[length] = this.items[i];
                length++;
            }
        }
        return Arrays.copyOf(result, length);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
        return index != -1;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != 1) {
            items[index] = null;
            int start = index + 1;
            int distPos = index;
            int lenght = size - index - 1;
            System.arraycopy(items, start, items, distPos, lenght);
            items[size - 1] = null;
            size--;
            return true;
        } else {
            return false;
        }
    }

}
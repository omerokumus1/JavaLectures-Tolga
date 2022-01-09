package HW.HW5;

import java.util.Arrays;

public class Storage {
    private int capacity;
    private Item[] items;

    public Storage(int capacity) {
        this.capacity = capacity;
        items = new Item[0];
    }

    public void addItem(Item item) {
        //if(items == null)
          //  items = new Item[0];
        Item[] copy = new Item[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            copy[i] = items[i];
        }
        copy[copy.length - 1] = item;
        items = copy;

    }

    public Item[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "capacity=" + capacity +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}


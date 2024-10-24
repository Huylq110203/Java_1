package demo.lab5;

import java.util.HashMap;
import java.util.Map;

public class BaiThem_HashMap {

    public static void main(String[] args) {
      
        for (Map.Entry<Integer, Item> entry : items.entrySet()) {
            Integer key = entry.getKey();
            Item item = entry.getValue();
            System.out.println("ID: " + key + ", Name: " + item.name + ", Price: " + item.price + ", Qty: " + item.qty);
        }
    }

    public static class Item {
        Integer id;
        String name;
        double price;
        int qty = 1;

        public Item(Integer id, String name, double price, int qty) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.qty = qty;
        }
    }

    public static Map<Integer, Item> items = new HashMap<>();

    static {
        items.put(1, new Item(1, "Samsung", 10.0, 0));
        items.put(2, new Item(2, "Iphone", 3.0, 0));
        items.put(3, new Item(3, "Galaxy", 15.0, 0));
        items.put(4, new Item(4, "Remi", 18.0, 0));
        items.put(5, new Item(5, "Oppo", 19.0, 0));
    }
}

package hillel.collections;

import java.util.HashMap;

public class ShoppingList {
    public static void main(String[] args) {
        int sumValue = 0;
        String[] products = {"corn", "apple", "juice", "cucumber", "avocado"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String prod : products) {
            hashMap.put(prod, (int) (Math.random() * 10 + 1));
        }
        for (int value : hashMap.values()) {
            sumValue += value;
        }
        System.out.println("List of products : " + hashMap);
        System.out.println("Count of products : " + sumValue);
    }
}

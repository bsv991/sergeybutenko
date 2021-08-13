package ua.hillel.collections;

import java.util.ArrayList;
import java.util.List;

public class NumbersSorting {
    public static void main(String[] args) {
        NumbersSorting.sortingNumbers();
    }
    private static void sortingNumbers() {
        List<Integer> initialCollection = new ArrayList<>();
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        List<Integer> listThree = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            initialCollection.add((int) (Math.random() * 500));
        }
        System.out.println("Initial collection : " + initialCollection);
        for (int b = 0; b < initialCollection.size(); b++) {
            if (initialCollection.get(b) % 2 == 0 && initialCollection.get(b) % 3 == 0) {
                listOne.add(initialCollection.get(b));
                listTwo.add(initialCollection.get(b));
            } else if (initialCollection.get(b) % 2 == 0) {
                listOne.add(initialCollection.get(b));
            } else if (initialCollection.get(b) % 3 == 0) {
                listTwo.add(initialCollection.get(b));
            } else {
                listThree.add(initialCollection.get(b));
            }
        }
        System.out.println("Collection divided by 2 : " + listOne);
        System.out.println("Collection divided by 3 : "+listTwo);
        System.out.println("Remainder of numbers : " + listThree);
    }
}

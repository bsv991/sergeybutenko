package ua.hillel.collections;

import java.util.*;

public class CollectionsDuplicateRemove {
    public static void main(String[] args) {
        CollectionsDuplicateRemove.removeDuplicateCollections();
    }

    private static void removeDuplicateCollections() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add((int) (Math.random() * 21));
        }
        System.out.println("ArrayList 100 Elements : " + arrayList);
        Set set = new HashSet(arrayList);
        int countDuplicates = arrayList.size() - set.size();
        arrayList.clear();
        System.out.println("ArrayList remove duplicates : " + set);
        System.out.println("Count duplicates :" + countDuplicates);
    }
}

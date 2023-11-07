package dev.patika.dattastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchMarkTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // compare add
        System.out.println("COMPARE ADD");
        System.out.println("===========");
        testAddTime(arrayList);
        testAddTime(linkedList);

        // compare get
        System.out.println("COMPARE GET");
        System.out.println("===========");
        testGetTime(arrayList);
        testGetTime(linkedList);

        // compare remove
        System.out.println("COMPARE REMOVE");
        System.out.println("===========");
        testRemoveTime(arrayList);
        testRemoveTime(linkedList);

    }

    private static void testAddTime(List<Integer> list) {
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long result1 = System.currentTimeMillis() - start1;

        System.out.println("Add operation is completed at " + result1 + " ms. for " + list.getClass().getSimpleName());
    }

    private static void testGetTime(List<Integer> list) {
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long result1 = System.currentTimeMillis() - start1;

        System.out.println("Get operation is completed at " + result1 + " ms. for " + list.getClass().getSimpleName());
    }

    private static void testRemoveTime(List<Integer> list) {
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.remove(Integer.valueOf(i));
        }
        long result1 = System.currentTimeMillis() - start1;

        System.out.println("Remove operation is completed at " + result1 + " ms. for " + list.getClass().getSimpleName());
    }
}

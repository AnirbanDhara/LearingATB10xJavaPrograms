package collection_framework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    // Duplicates are not allowed
    // But Insertion order is present
    public static void main(String[] args){
        //LinkedHashSet <Integer> lset = new LinkedHashSet<>();
        LinkedHashSet lset = new LinkedHashSet<>();

        lset.add(100);
        lset.add(200);
        lset.add(300);
        lset.add(400);
        lset.add(500);

        System.out.println(lset); // [100, 200, 300, 400, 500]
    }
}

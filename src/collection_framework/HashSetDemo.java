package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    // Duplicates are not allowed
    // Insertion order is not maintained
    // HashCode
    // Heterogeneous data supported as other collections

    public static void main(String[] args){
        // Set hs = new HashSet(); // Dynamic Dispatch
        // HashSet < Integer> hs = new HashSet<>();
        // HashSet hs = new HashSet(100); // Initial capacity
        // HashSet hs1 = new HashSet(100, 0.95f);

        HashSet hs = new HashSet(); // Default capacity 16, Load factor 0.75

        // Add elements
        hs.add(80);
        hs.add("welcome");
        hs.add('A');
        hs.add(null);
        hs.add(16.4);
        hs.add(null);
        hs.add(true);

        System.out.println(hs);

        // Remove
        hs.remove(16.4);

        System.out.println(hs);

        // contains()
        boolean bool = hs.contains(50);
        System.out.println(bool); // false

        // isEmpty()
        System.out.println(hs.isEmpty()); // false

        // Traversing in HashSet

        // 1st Method
//        for(Object b : hs)
//        {
//            System.out.print(b + " ");
//        }

        // 2nd Method
//        Iterator it = hs.iterator();
//
//        while(it.hasNext()){
//            System.out.print(it.next() + " ");
//        }

        // addAll()
        HashSet <Integer> hs_new = new HashSet<>();
        hs_new.add(40);
        hs_new.add(2);
        hs_new.add(34);

        System.out.println(hs_new);

        hs_new.addAll(hs);

        System.out.println(hs_new);

        // removeAll()
        hs_new.removeAll(hs);
        System.out.println(hs_new);

        //Union, Intersection, difference

        HashSet <Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet <Integer> set2 = new HashSet<>();

        set2.add(3);
        set2.add(4);
        set2.add(5);

        //union
//        set1.addAll(set2);
//        System.out.println("Union : "+ set1);

        //Intersection
//        set1.retainAll(set2);
//        System.out.println("Intersection : "+ set1);

        //difference
//        set1.removeAll(set2);
//        System.out.println("Difference : "+ set1);

        // subset
        System.out.println(set1.containsAll(set2));
        // System.out.println("Subset : "+set1);



    }
}

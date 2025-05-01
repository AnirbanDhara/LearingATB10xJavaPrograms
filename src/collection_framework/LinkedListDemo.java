package collection_framework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Declare LinkedList
        //LinkedList <Integer> l1 = new LinkedList<Integer>();
        //LinkedList <String> l2 = new LinkedList<String>();
        LinkedList l = new LinkedList<>();
        LinkedList <Integer> l1 = new LinkedList<>();
        LinkedList l2 = new LinkedList();

        // Add elements into LinkedList
        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add(true);
        l.add(null);
        l.add(100);
        l.add('A');
        l.add(null);

        System.out.println(l); // [100, welcome, 15.5, true, null, 100, A, null]
        System.out.println(l.size()); // 8

        // Remove
        l.remove(3);
        boolean x = l.remove("welcome");
        System.out.println(l); // [100, 15.5, null, 100, A, null]
        System.out.println(x); // true

        // Insert/adding element in the middle of linked list
        l.add(4,9.55);
        System.out.println(l); // [100, 15.5, null, 100, 9.55, A, null]

        // Retrieving value/object
        Object my_ele = l.get(3);
        Object first_ele = l.getFirst();
        Object last_ele = l.getLast();
        System.out.println(my_ele); // 100
        System.out.println(first_ele); // 100
        System.out.println(last_ele); // null

        // change/set value at specific index
        l.set(1,"Hello");
        System.out.println(l); // [100, Hello, null, 100, 9.55, A, null]

        // contains()
        boolean bool = l.contains(100);
        boolean bool_1 = l.contains("World");
        System.out.println(bool); // true
        System.out.println(bool_1); // false

        //isEmpty()
        boolean b = l.isEmpty();
        System.out.println(b);

        // Traversing in LinkedList

        // 1. 1st Method
        /* for(int i = 0; i < l.size(); i++){
            System.out.print(l.get(i) + " "); // 100 Hello null 100 9.55 A null
        }*/

        // 2. 2nd Method
        /* for(Object e : l){
            System.out.print(e + " "); // 100 Hello null 100 9.55 A null
        }*/

        // 3rd Method
        Iterator it = l.iterator();

        while(it.hasNext())
        {
            Object e = it.next();
            System.out.print(e + " "); // 100 Hello null 100 9.55 A null
        }

        System.out.print("\n");

        l1.add(4);
        l1.add(2);
        l1.add(6);
        l1.add(5);
        l1.add(9);

        l2.addAll(l1);
        System.out.println(l2); // [4, 2, 6, 5, 9]

        l2.removeAll(l1);
        System.out.println(l2); // []

        Collections.sort(l1);
        System.out.println(l1); // [2, 4, 5, 6, 9]

        // Reverse order
//        Collections.reverse(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1); // [9, 6, 5, 4, 2]

//        Collections.shuffle(l1);
//        System.out.println(l1);

    }
}

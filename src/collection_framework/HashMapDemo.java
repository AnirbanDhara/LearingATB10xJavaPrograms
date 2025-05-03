package collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args){
        // Underlying Data-Structure is HashTable
        // Insertion order is not Preserved
        // Duplicate Keys are not Allowed
        // Duplicate Values are allowed
        // Null Keys are allowed Once
        // Multiple Null Values are allowed.

        //Map mp = new HashMap<>();
        HashMap<Integer, String> mp = new HashMap<>();
        //HashMap mp = new HashMap<>();

        // Adding Key, Value pair into HashMap
        mp.put(101, "David");
        mp.put(102, "Smith");
        mp.put(103, "Tyler");
        mp.put(104, "Henry");
        mp.put(105, "John");
        mp.put(106, "Scott");
        mp.put(107, "David");

        System.out.println(mp); // {101=David, 102=Smith, 103=Tyler, 104=Henry, 105=John, 106=Scott, 107=David}

        System.out.println(mp.get(105)); // return Value to the respective Key ; John

//        mp.remove(107); // remove pair from HashMap
//        System.out.println(mp);

        System.out.println(mp.containsKey(101)); // true
        System.out.println(mp.containsKey(107)); // false

        System.out.println(mp.containsValue("Scott")); // true
        System.out.println(mp.containsValue("Emma")); // false

        System.out.println(mp.isEmpty()); // false

//        System.out.println(mp.keySet()); // return all Keys as Set; [101, 102, 103, 104, 105, 106]

        for(Object i : mp.keySet())
        {
            System.out.println(i);
        }

//        System.out.println(mp.values()); // return all Values as Collection; [David, Smith, Tyler, Henry, John, Scott, David]

        for(Object v : mp.values())
        {
            System.out.println(v);
        }

//        System.out.println(mp.entrySet()); // return all Entries as Set; [101=David, 102=Smith, 103=Tyler, 104=Henry, 105=John, 106=Scott, 107=David]

//        for(Object i : mp.keySet())
//        {
//            System.out.println(i + ":" + "\""+mp.get(i)+"\"");
//        }

        // Entry methods
        // **************
        /*for(Map.Entry entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + ":" + "\""+entry.getValue()+"\"");
        }*/

        // Iterator
        Set set = mp.entrySet();

        Iterator it = set.iterator();

        while(it.hasNext())
        {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + ":" + "\""+entry.getValue()+"\"");
        }

    }
}

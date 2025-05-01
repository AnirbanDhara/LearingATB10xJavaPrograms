package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        /*
    1. Heterogeneous Data allowed
    2. Insertion Order - preserved
    3. Duplicate elements - allowed
    4. Multiple nulls - allowed
     */

        // ArrayList<Integer,String> myList = new ArrayList<Integer,String>(); We can pass only one argument
        //ArrayList myList = new ArrayList(); //Valid
        List <Integer> mylist = new ArrayList<>();

        // Adding data into arraylist
//        mylist.add(100);
//        mylist.add(10.5);
//        mylist.add("welcome");
//        mylist.add(true);
//        mylist.add(null);
//        mylist.add(100);
//        mylist.add(null);
//        System.out.println(mylist);


        mylist.add(4);
        mylist.add(2);
        mylist.add(7);
        mylist.add(3,8);

        //Collections.sort(mylist);
        Collections.shuffle(mylist);
        System.out.println(mylist);
    }

}

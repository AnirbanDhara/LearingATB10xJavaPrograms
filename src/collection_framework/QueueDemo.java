package collection_framework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
     /*
    1. Heterogeneous Data not allowed
    2. Insertion Order - preserved
    3. Duplicate elements - allowed
    4. Multiple nulls - allowed
     */
    public static void main(String[] args){
        PriorityQueue queue = new PriorityQueue();

        // Adding elements ---> add(), offer()
        queue.add('A');
        queue.add('B');
        queue.add('C');
        queue.add('C');
        queue.offer('D');

        System.out.println(queue);

        //Get elements ---> element(), peek()
        Object ch1 = queue.element(); // returns 'head' element, throws NoSuchElementException if queue is Empty
        Object ch2 = queue.peek(); // returns null if queue is Empty

        System.out.println(ch1);
        System.out.println(ch2);

        //Return and Remove element from queue ---> remove(), poll()
//        System.out.println(queue.remove()); // A
//        System.out.println(queue); // [B, C, C, D]

        System.out.println(queue.poll()); // returns and removes 'head' element, throws NoSuchElementException if queue is Empty
        System.out.println(queue); // returns null if queue is Empty

//        Iterator it = queue.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        for(Object ob : queue){
            System.out.println(ob);
        }

    }


}

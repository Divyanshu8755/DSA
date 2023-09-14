package HeapLec;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Demo_2 {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq=new PriorityQueue<>();//By default Min Heap
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());//Max Heap
        pq.add(2);
        pq.add(4);
        pq.add(5);
        pq.add(7);
        pq.add(6);
        pq.add(1);
        pq.add(4);
        pq.add(9);
        pq.add(7);
        pq.add(3);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
}

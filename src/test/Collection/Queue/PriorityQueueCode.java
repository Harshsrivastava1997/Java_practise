package test.Collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueCode {
    public static void main(String[]args)
    {
        PriorityQueue pq = new PriorityQueue();

        //Adding elements to priorityQueue using add() method
        // Duplicates are allowed and also insertion order is preserved
        // Only Homogeneous data is allowed

        pq.add(10);
        pq.add(20);
        pq.add(10); // Duplicates are allowed
       // pq.add("Harsh"); // it should give exception because only homogeneous data is allowed

        //Adding elemets using offer() method

        pq.offer(30);
        pq.offer(40);
        pq.offer(40); //Duplcates are allowed
        // pq.offer("Srivastava"); // it should return false becuase only homogenous data is allowed

        System.out.println("Priority Queue elements are : "+pq);

        // Finding head element using peek()  method
        System.out.println("Head element using peek method is :"+pq.peek());

        //Finding head element using element() method
        System.out.println("Head element using element() method is : "+pq.element());

        //remove() method will return head element and also remove it from queue

        System.out.println("Head element after removing using remove() method is :"+pq.remove());

        // After removing head element the queue is
        System.out.println("After removing head element is :"+pq);
        //Now head element is changed
        System.out.println("New head element is : " +pq.peek());


        // poll() method will also remove the head element and return it

        System.out.println("Head element after removing using pool()method is :"+pq.poll());
         // After removing head element the queue is
        System.out.println("New Queue is : "+pq);





    }
}

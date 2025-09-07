package test.Collection.Queue;

import java.util.LinkedList;

public class LinkedListUsingQueue {
    public static void main(String[]args)
    {
        LinkedList ll = new LinkedList();

        //Adding elements to linked list
        // Duplicates are allowed and also insertion order is preserved
        // Hetrogeneous data is also allowed

        ll.add(10);
        ll.add("harsh");
        ll.add(20.5);
        ll.add(true);
        ll.add(null);

        System.out.println("Linked List elements are : "+ll);

        // Adding more elements using offer() mehtod
        ll.offer(100);
        ll.offer("Java");
        ll.offer(100000.5678);
        ll.offer(false);
        ll.offer("Java");

        System.out.println("Now linked list becomes: "+ll);

        //Fetching head element using element() method

        System.out.println("Head element using element() method is : "+ll.element());

        //Fetching head element using peek() method
        System.out.println("USing peek() method head element is : "+ll.peek());

        //remove() method will return head element and then remove it from the queue
        System.out.println("Head element is : "+ll.remove());

        //Now Queue becomes
        System.out.println("After removing head element queue is : "+ll);
        System.out.println("Head is pointing to : "+ll.element());

        //poll() method will also remove the head element aftert returning it

        System.out.println("Head element is : "+ll.poll());

        //Now Queue becomes
        System.out.println("After removing head element queue is : "+ll);
        System.out.println("Head is pointing to : "+ll.element());
    }
}

package test.Collection.LinkedList;

import java.util.LinkedList;

public class SpecialLinkedListMEthods {
    public static void main(String args[])
    {
        //Creating LinkedList

        LinkedList ll3 = new LinkedList();

        ll3.add("cat");
        ll3.add("dog");
        ll3.add("cat");
        ll3.add("dog");

        System.out.println("Before adding LinkedList is : "+ll3);

        //Adding element at first of linkedlist
        ll3.addFirst("tiger");
        System.out.println("After adding element at first :"+ll3);

        //Adding element at last of linkedlist
        ll3.addLast("Zebra");
        System.out.println("After adding element at last :"+ll3);

        //Removing first element
        ll3.removeFirst();

        System.out.println("After removing  element at first "+ll3);

        //Removing last element
        ll3.removeLast();
        System.out.println("After removing  element at last "+ll3);

        // Getting first element
        System.out.println(ll3.getFirst());

        //Getting last element
        System.out.println(ll3.getLast());
    }
}

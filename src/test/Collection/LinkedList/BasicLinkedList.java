package test.Collection.LinkedList;

import java.util.LinkedList;

public class BasicLinkedList {

    public static void main(String[]args)
    {
        LinkedList l= new LinkedList();

        //Adding elements to linledlist

        l.add(3);
        l.add("Harsh");
        l.add("true");
        l.add('a');
        l.add(28.8);
        l.add(null);

        System.out.println("LinkedList is : "+l);

        //getting size of linkedlist
        int size = l.size();
        System.out.println("size of linkedList is : "+size);
        //removing element from LinkedList
        l.remove(Integer.valueOf(3));

        System.out.println("after removal linked list is : "+l);

        // removing using index
        l.remove(2);
        System.out.println("New linked list is : "+l);

        //Insrting element at particular index
        l.add(2,"LinkedList");

        System.out.println("After inserting new element linked list is : "+l);

        //Retrieving element from linked list
        System.out.println("retrieving 3rd index element : " +l.get(3));


        l.set((l.size())-1, "Learning"); // l.size()- 1 means last index in linked list

        System.out.println("Afetr replacing new linke list is : " +l);
    }
}

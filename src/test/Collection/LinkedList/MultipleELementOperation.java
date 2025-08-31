package test.Collection.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class MultipleELementOperation {

    public static void main(String[] args) {
        //For adding multiple element we need another collection that will have multiple elment
        // then we will pass that collection in LinkedList


        //Creating ArrayList collection this we will pass in our current linkedList

        ArrayList al = new ArrayList();
        al.add(25);
        al.add("java");
        al.add('a');
        al.add(25.5);

        //Creating Linked List in which we will pass this ArrayList

        LinkedList ll2 = new LinkedList();

        //adding arraylist to linkedlist
        ll2.addAll(al);
        System.out.println("Now linkedList is :" + ll2);
        System.out.println("Size is : "+ll2.size());

        //Removing multiple elemeent from LinkedList
        ll2.removeAll(al);
        System.out.println("After removal linked list is : "+ll2);
        System.out.println("size is now : "+ll2.size());
    }
}

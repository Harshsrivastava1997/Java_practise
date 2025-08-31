package test.Collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class SortingAndShuffling {

    public static void main(String[] args) {


        //Creating ArrayList collection this we will pass in our current linkedList

        LinkedList<Integer> ll = new <Integer>LinkedList();
        ll.add(25);
        ll.add(100);
        ll.add(-23);
        ll.add(0);


        //Sorting this LinkedList
        //Collections class is present in java.util package from there we can these methods
        System.out.println("Befor Sorting LinkedList is "+ll);

        Collections.sort(ll);
        System.out.println("After sorting  List is :" + ll);

        //Shuffling the LinkedList
        Collections.shuffle(ll);
        System.out.println("After shuffling linked list is :" + ll);
    }
}

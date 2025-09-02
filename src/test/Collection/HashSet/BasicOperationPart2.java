package test.Collection.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class BasicOperationPart2 {
    public static void main(String[] args) {
        //Creating ArrayList that we will pass in HashSet

        ArrayList al = new ArrayList();

        //Adding element in Arraylist
        al.add("Harsh");
        al.add('b');
        al.add(75);
        al.add(100.5);
        al.add(true);
        al.add(null);
        al.add("Harsh");

        //Priting ArrayList
        System.out.println("ArrayList is : " + al);
        System.out.println("Size of arrayList is : "+al.size());

        //Creating Hashset on which we will pass this ArrayList

        HashSet hs = new HashSet();

        //Adding whole ArrayList to HashSet
        //ArrayList has duplicate element check it will be availabe in hashset or not

        hs.addAll(al);

        //Printing HashsEt after adding ArrayList
        System.out.println("HashSet after adding ArrayList is " + hs);
        System.out.println("HashSet size is : "+hs.size());

        //Removing whole ArrayList from HashSet

        hs.removeAll(al);
        System.out.println("New Hashset is : "+hs);
        System.out.println("Its size is : "+hs.size());


    }
}

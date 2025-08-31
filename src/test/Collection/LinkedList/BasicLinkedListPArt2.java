package test.Collection.LinkedList;

import java.util.LinkedList;

public class BasicLinkedListPArt2 {
    public static void main(String []args)
    {
        LinkedList l2 = new LinkedList();
        l2.add(10);
        l2.add("Testing");
        l2.add('b');
        l2.add(69.9);
        l2.add(true);
        l2.add(null);

        //Checking linked list is empty or not
        System.out.println("Is linkedList empty : "+l2.isEmpty()); // return true or false

        //Checking element is present or not
        System.out.println("Is null element present: "+l2.contains(null)); // return true or false
        System.out.println("Is Harry elemeent present :"+l2.contains("Harry"));
    }
}

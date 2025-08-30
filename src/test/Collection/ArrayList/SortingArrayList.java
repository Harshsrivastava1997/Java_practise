package test.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[]args)
    {
        ArrayList <Integer>al = new <Integer >ArrayList();
        al.add(1000);
        al.add(10);
        al.add(50);
        al.add(2);
        al.add(100);
        al.add(0);
        al.add(-7);

        System.out.println("ArrayList before sorting: "+al);

        //Sorting Arraylist using collections.sort()
        // ArrayList implements the List interface, and Collections.sort() requires a List.

        Collections.sort(al);

        System.out.println("ArrayList after soritng is : "+al);

        //Sorting in reverse order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("after Reverse order sorting  : "+al);
    }
}

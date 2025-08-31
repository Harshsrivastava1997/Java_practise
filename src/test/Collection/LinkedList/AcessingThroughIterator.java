package test.Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AcessingThroughIterator {
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.add(3);
        ll.add("Harsh");
        ll.add("true");
        ll.add('a');
        ll.add(28.8);
        ll.add(null);

        //Creating Iteratro insatance

        Iterator it = ll.iterator();

        //Acessing Through Iterator
        while(it.hasNext())
        {
            System.out.println("Accessed element is  : "+it.next());
        }
    }
}



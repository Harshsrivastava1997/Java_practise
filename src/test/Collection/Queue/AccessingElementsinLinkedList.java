package test.Collection.Queue;

import java.util.Iterator;
import java.util.LinkedList;

public class AccessingElementsinLinkedList {
    public static void main(String[]args)
    {
        LinkedList ll1 = new LinkedList();
        ll1.add(100);
        ll1.add("Harsh");
        ll1.add('a');

        ll1.offer("Harsh");
        ll1.offer(true);

        //Acessign through iterator()

        Iterator it = ll1.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //Accessing through for each loop

        System.out.println("For loops output is : ");

        for(Object ele:ll1)
        {
            System.out.println(ele);
        }
    }
}

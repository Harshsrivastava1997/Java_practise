package test.Collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class AcessingElementsInPriorityQueu {
    public static void main(String[]args)
    {
        PriorityQueue <Integer>pq1 = new PriorityQueue<Integer>();

        //Adding elements to priority Queue

        pq1.add(100);
        pq1.add(200);

        pq1.offer(300);
        pq1.offer(400);

        //Acessing elements using iterator()

        Iterator it =pq1.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        // Acessing through for each loop

        System.out.println("For loops output is : ");

        for(int ele:pq1)
        {
            System.out.println(ele);
        }




    }
}

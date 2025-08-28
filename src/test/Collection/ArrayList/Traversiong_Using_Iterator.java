package test.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Traversiong_Using_Iterator {
    public static void main(String[] args) {
        List list = new ArrayList();

        //Adding elements tot this arraylist
        list.add(10);
        list.add("Testing");
        list.add('a');
        list.add(25.5);
        list.add(false);

        System.out.println(list);

        //Traversing elements using iterator
        Iterator it = list.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
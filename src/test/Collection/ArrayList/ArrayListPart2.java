package test.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPart2 {

    public static void main(String[]args)
    {
        List list = new ArrayList();

        //Adding elements tot this arraylist
        list.add(10);
        list.add("Testing");
        list.add('a');
        list.add(25.5);
        list.add(false);

        System.out.println(list);

        //Traversing elements using for loop

        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}

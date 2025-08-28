package test.Collection.ArrayList;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[]args)
    {
        ArrayList al= new ArrayList();
        //Adding elements tot this arraylist
        al.add(10);
        al.add("Testing");
       al.add('a');
       al.add(25.5);
        al.add(false);

        System.out.println(al);

        //Trraversing elements using for each loop
        for (Object el: al)
        {
            System.out.println("Treavesed elements is : "+el);
        }
    }
}

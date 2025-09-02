package test.Collection.HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class ConvertHashSetToArrayList {
    public static void main(String[]args)
    {
        //Creating HashSet
        HashSet hs = new HashSet(100,0.90f);

        // Adding elements to HashSet
        hs.add("Srivastava"	);
        hs.add(75);
        hs.add('z');
        hs.add(null);
        hs.add(true);

        //Creating ArrayList

        ArrayList al = new ArrayList(hs);

     //   for(Object elem:hs)
    //    {
    //        al.add(elem);
    //    }

        System.out.println("ArrayList element is : "+al);


    }

}

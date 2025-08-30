package test.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ShufflingArrayList {

    public static void main(String [] args)
    {
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add("Ruby");
        al1.add('z');
        al1.add(25.5);

        System.out.println("ArrayList Before Shuffling is : "+al1);


        //Shuffling the ArrayList

        Collections.shuffle(al1);

        System.out.println("After shuffling ArrayList becomes : " +al1);
    }
}

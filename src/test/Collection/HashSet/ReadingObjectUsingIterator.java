package test.Collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class ReadingObjectUsingIterator {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add("Tester");
        hs.add('r');
        hs.add(null);
        hs.add(75);

        //Reading the element
        //this is not accessing the element
        //Accessing is not alowed because no index is there in HashSet

        Iterator it = hs.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

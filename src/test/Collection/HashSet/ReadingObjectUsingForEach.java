package test.Collection.HashSet;

import java.util.HashSet;

public class ReadingObjectUsingForEach {

    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add("Tester");
        hs.add('r');
        hs.add(null);
        hs.add(75);

        //Reading/Accessing the elemenet
        for (Object elem : hs) {
            System.out.println("element is : " + elem);
        }
    }
}

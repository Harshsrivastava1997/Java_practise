package test.Collection.HashSet;

import java.util.HashSet;

public class BasicOperations {
    public static void main(String []args)
    {
        //Creating HAshset

        HashSet hs = new HashSet();

        //Adding element in Hashse
        hs.add("Harsh");
        hs.add('a');
        hs.add(69);
        hs.add(10.5);
        hs.add(false);
        hs.add(null);
        hs.add("Harsh");   // Chcecking duplicates are stroring or not

        //Printing HashSet
        System.out.println("Hashset is : "+hs);

        //Removing elements from Hashset
        hs.remove(69);
        hs.remove(null);


        System.out.println("Hashset after removing is : "+hs);

        // checking element presence

        System.out.println(hs.contains("Harsh"));  //true
        System.out.println( hs.contains(69)); // false becuase 69 is removed

        // Checking Hashset size

        System.out.println("HashSet size is : "+hs.size());

        //Checking Hashset is empty or not

        System.out.println("Is HashSet empty : "+hs.isEmpty());
    }
}

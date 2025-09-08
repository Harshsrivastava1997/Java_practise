package test.Collection.HashMap;

import java.util.HashMap;

public class BasicOperationinHashMap {
    public static void main(String[]args)
    {
        //Creating HashMap

        HashMap hm = new HashMap();

        //Adding elements to HashMap
        hm.put(1,"Harsh");
        hm.put(2,"Srivastava");
        hm.put(3,"Harsh"); //Checking duplicates

        hm.put(4,'a'); // Hetrogenoeus data type
        hm.put(5,null); // null value
        hm.put(6,100);
        hm.put(7,25.5);
        hm.put(null,"Test");
        hm.put(8,null); //duplicate null value is allowed

        //Printing HashMap

        System.out.println("HashMap is :"+hm);

        // removing elements from HashMap
        // it is based on keys not on values

        hm.remove(2);
        hm.remove(null);
        System.out.println("After removing Hashmap is : "+hm);

        //Checking is hasmap empty
        System.out.println("IS hashmap empty? "+hm.isEmpty());

        //Printing size of HashMap

        System.out.println("Size of HashMap is :"+hm.size());
    }
}

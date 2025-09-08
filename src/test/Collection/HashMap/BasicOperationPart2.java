package test.Collection.HashMap;

import java.util.HashMap;

public class BasicOperationPart2 {
    public static void main(String [] args)
    {
        //Creating HashMap

        HashMap hm = new HashMap();

        //Adding elements to HashMap
        hm.put(1,"Java");
        hm.put(2,"Collection");
        hm.put(3,"Harsh"); //Checking duplicates

        hm.put(4,'a'); // Hetrogenoeus data type
        hm.put(5,null); // null value
        hm.put(6,1000);
        hm.put(7,257.5);
        hm.put(null,"Tester");
        hm.put(9,null); //duplicate null value is allowed

        // Printing all keys from HashMap

        System.out.println("All keys from hashmap are : "+hm.keySet());

        //Printing all values from HashMap

        System.out.println("All values from Hashmap are : "+hm.values());

        // Printing key and values both

        System.out.println("All keys and values are : "+hm.entrySet());

        // Checking Specific key is present or not

        System.out.println("Is key 6 present ? "+ hm.containsKey(6)); // true

        System.out.println("Is key 10 available ? "+hm.containsKey(10)); //false

        //Checking specific value is present or not

        System.out.println("Is value null present ? "+hm.containsValue(null));

        System.out.println("IS value Tester Present ? "+hm.containsValue("Tester"));
    }
}

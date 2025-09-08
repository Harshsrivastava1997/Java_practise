package test.Collection.HashTable;

import java.util.Hashtable;

public class BasicOperation {
    public static void main(String[]args)
    {
        // Creating a Hashtable

        Hashtable ht = new Hashtable();

        //Adding values to HashTable
        // Insertion order is not preserved
        //It is based on hashing algorithm

        ht.put(1, "Java");
        ht.put(2,"Collection");
        ht.put(3,'a');
        ht.put("test",true);

        //ht.put(5,null); // null not allowed as value
      //  ht.put(null, "Hash"); // null not allowed as key as well

        ht.put(7,"Java"); //duplicates are allowed
        ht.put(8, 25.5);

        //Printing this hashtable
        System.out.println("HashTable is : "+ht);

        //Checking if hashtable empty
        System.out.println("IS hashTable empty ? "+ht.isEmpty());

        //Printing size of hashtable
        System.out.println("Size of hashTable is : "+ht.size());

        //Retrieving value based on key
        System.out.println("Value for key test is : "+ht.get("test"));

        System.out.println("Value for key 8 is : "+ht.get(8));

        //Removing element from hashtable
        //it based on index , not on value
        ht.remove(2);
        System.out.println("New HashTable is "+ht);

    }
}

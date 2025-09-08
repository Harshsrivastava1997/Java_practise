package test.Collection.HashTable;

import java.util.Hashtable;

public class BasicOperation3 {
    public static void main(String[]args)
    {
        //Creating HAshtable

        Hashtable<Integer,String> htm = new Hashtable<>();
        htm.put(1, "java");
        htm.put(2,"apple");
        htm.put(3,"Selenoid");
        htm.put(4,"Rest Assured");

        // Priting all keys from HashTable

        System.out.println("All keys in the HashTable is : "+htm.keySet());

        //Printing all values from HashTable
        System.out.println("All Values from Hashtable is : "+htm.values());

        //printing both keys and values

        System.out.println("All keys and values are : "+htm.entrySet());

        //Checking Specific key is present or not

        System.out.println("IS key 4 present ? "+htm.containsKey(4));

        //Checking specific values is presnet or not
        System.out.println("Is value Selenoid present ? "+htm.containsValue("Selenoid"));

        System.out.println("Is value TESTNG present ? "+htm.containsValue("TESTNG"));
    }
}

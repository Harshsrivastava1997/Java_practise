package test.Collection.HashTable;

import test.Collection.ArrayList.Traversiong_Using_Iterator;

import java.util.Hashtable;

public class BasicOperationPart2 {
    public static void main(String[]args)
    {
        Hashtable <Integer, Integer>ht1 = new Hashtable<>();

        ht1.put(1,100);
        ht1.put(2,200);
        ht1.put(3,300);
        ht1.put(4,400);
        ht1.put(5,500);

        //Creating another hashtable where we  will put this hastable
        Hashtable <Integer, Integer> ht2 = new Hashtable<>();
        System.out.println("Before adding Hashtable1 to Hashtbale2 : "+ht2);

        //Adding another hashtable to this hashtable
        ht2.putAll(ht1);
        System.out.println("After adding Hahtable2 becomes :"+ht2);

        System.out.println("Its size is : "+ht2.size());

        System.out.println("Is hashtable2 empty : "+ht2.isEmpty());

        // Removing all elements from hashtable2
        System.out.println("Removing all elements from Hashtable2");
        ht2.clear();

        System.out.println("IS hashtable2 empty now : "+ht2.isEmpty());

    }
}

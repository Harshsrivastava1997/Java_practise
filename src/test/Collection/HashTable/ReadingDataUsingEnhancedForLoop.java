package test.Collection.HashTable;

import java.util.Hashtable;

public class ReadingDataUsingEnhancedForLoop {
    public static void main(String[]args)
    {
        Hashtable<Integer, Integer> ht1 = new Hashtable<>();

        ht1.put(1,100);
        ht1.put(2,200);
        ht1.put(3,300);
        ht1.put(4,400);
        ht1.put(5,500);

        // Reading data
        for(int keys:ht1.keySet())
        {
            System.out.println(keys + " : "+ ht1.get(keys));
        }
    }
}

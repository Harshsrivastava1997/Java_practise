package test.Collection.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class ReadingDataThroughEntry {
    public static void main(String[]args)
    {
        Hashtable <Integer, Integer> ht1 = new Hashtable<>();

        ht1.put(1,100);
        ht1.put(2,200);
        ht1.put(3,300);
        ht1.put(4,400);
        ht1.put(5,500);

        // Reading data using entryset

        for(Map.Entry entries :ht1.entrySet())
        {
            System.out.println(entries.getKey()+ " : "+entries.getValue());
        }
    }
}

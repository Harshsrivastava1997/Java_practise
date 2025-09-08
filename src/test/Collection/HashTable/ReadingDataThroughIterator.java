package test.Collection.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class ReadingDataThroughIterator {
    public static void main(String[] args) {

        Hashtable<Integer, String> htm = new Hashtable<>();
        htm.put(1, "java");
        htm.put(2, "apple");
        htm.put(3, "Selenoid");
        htm.put(4, "Rest Assured");

        Iterator it = htm.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entries=(Map.Entry)it.next();
            System.out.println(entries.getKey()+ " "+entries.getValue());

        }
    }
}
package test.Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;



public class ReadingDataUsingIterator {
    public static void main(String[] args) {
        HashMap<String, String> hmnew = new HashMap<>();

        hmnew.put("Java", "Studying");
        hmnew.put("Selenium", "Done");
        hmnew.put("Rest assured", "Half way");
        hmnew.put("Git", "Already know");
        hmnew.put("Jenkins", null);

        // Using iterator to read data
        Iterator it = hmnew.entrySet().iterator();

       // while(it.)
    }
}
package test.Collection.HashMap;

import java.util.HashMap;

public class ReadingDataUsingEnhancedForLoop {
    public static void main(String args[])
    {
        HashMap<String,String>  hmnew = new HashMap<>();

        hmnew.put("Java","Studying");
        hmnew.put("Selenium","Done");
        hmnew.put("Rest assured","Half way");
        hmnew.put("Git","Already know");
        hmnew.put("Jenkins", null);

        //Using enhanced for loop to read data
        //First read all keys using keyset() method

        for(String key_values:hmnew.keySet())
        {
            System.out.println("All keys are : "+key_values);
        }

        // Now reading all values
        for(String values : hmnew.values())
        {
            System.out.println("All values are : "+values);
        }

        // Combining both keys and vlaues pair

        for(String keys:hmnew.keySet())
        {
            System.out.println(keys+ " : "+hmnew.get(keys));
        }
    }
}

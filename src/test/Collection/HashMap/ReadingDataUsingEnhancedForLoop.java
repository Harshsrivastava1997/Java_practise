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
        //Using enhanced for loop to read data

        for(String keys:hmnew.keySet())
        {
            System.out.println(keys+ " : "+hmnew.get(keys));
        }
    }
}

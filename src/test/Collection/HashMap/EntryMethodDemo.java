package test.Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class EntryMethodDemo {
    public static void main(String[]args)
    {

        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("java",10);
        hm1.put("Selenium",20);
        hm1.put("Rest Assured", 30);
        hm1.put("Cypress", 10);
        hm1.put("Java",50);
        hm1.put("Playwright", 100);

        // Creating entry set to read all key value pair
        for(Map.Entry pairs : hm1.entrySet())
        {
            System.out.println(pairs.getKey()+ " : "+pairs.getValue());
        }
    }
}

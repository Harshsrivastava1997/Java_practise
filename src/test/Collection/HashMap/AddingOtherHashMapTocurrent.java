package test.Collection.HashMap;

import java.util.HashMap;

public class AddingOtherHashMapTocurrent {
    public static void main(String[]args)
    {
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("java",10);
        hm1.put("Selenium",20);
        hm1.put("Rest Assured", 30);
        hm1.put("Cypress", 10);
        hm1.put("Java",50);
        hm1.put("Playwright", 100);

       //Creating another Hashmap where we will add this hashmap

        HashMap<String,Integer> hm2 = new HashMap<>();

        //Printing 2nd HashMap before adding first Hashmap
        System.out.println("2nd hashmap is : "+hm2);
        //Checking is it empty
        System.out.println("IS 2nd hashmap empty rigth now : "+hm2.isEmpty());

        // adding hm1 to hm2
        hm2.putAll(hm1);

        //After adding priting hm2
        System.out.println("After adding second hashmap becomes : "+hm2);
        System.out.println("its size is : "+hm2.size());


        // Removing all elements from hm2

        hm2.clear();
        System.out.println("After removing 2nd hashmap is : "+hm2);
        System.out.println("ITs size is : "+hm2.size());

        //Checking first hashmap is not affected
        System.out.println("Is first hashmap is affected ? "+hm1.isEmpty());
        System.out.println("First hashmap is : "+hm1);
        System.out.println("Still its size is : "+hm1.size());


    }
}

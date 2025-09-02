package test.Collection.HashSet;

import java.util.HashSet;

public class UnionOfHashSets {
    public static void main(String[]args)
    {
        //Creating 1st HashSet

        HashSet<Integer>set1 = new HashSet <Integer>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        //Creating 2nd HashSet
        HashSet<Integer>set2= new<Integer>HashSet();
        set2.add(40);
        set2.add(50);
        set2.add(60);

        //Doing unoin of 2 HashSet

        set2.addAll(set1);
        System.out.println("Union is : "+set2);
    }
}

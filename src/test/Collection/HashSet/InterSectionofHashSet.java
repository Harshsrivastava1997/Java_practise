package test.Collection.HashSet;

import java.util.HashSet;

public class InterSectionofHashSet {
    public static void main(String[] args) {
        //Creating 1st HashSet

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);
        System.out.println("HashSet1 is : " + set1);

        //Creating 2nd HashSet
        HashSet<Integer> set2 = new <Integer>HashSet();
        set2.add(400);
        set2.add(500);
        set2.add(600);
        set2.add(200);
        System.out.println("HashSet2 is : +" + set2);

        //Doing Intersection of 2 HashSet
        //Intersection means commmon between 2 Hashset

        set1.retainAll(set2);
        System.out.println("Intersection is : " + set1);
    }
}
package test.Collection.ArrayList;

import java.util.ArrayList;

public class ConvertingArrayListToArray {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        //Adding Elements to ArrayList
        al.add(25);
        al.add("Harsh");
        al.add(true);
        al.add('a');
        al.add(23.75);
        al.add(false);
        al.add("Srivastava");

        System.out.println(al);

        //converting ArrayList to Array

        Object arr1[]= al.toArray();

        //Printing array elements
        System.out.println("array elemnts are : ");

        for(Object elem :arr1)
        {
            System.out.print(" "+elem);
        }
    }
}

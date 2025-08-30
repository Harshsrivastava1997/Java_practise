package test.Collection.ArrayList;

import java.util.ArrayList;

public class addAllInArrayList {

    public static void main(String[]args)
    {
        ArrayList al = new ArrayList();
        al.add("Java");
        al.add('a');
        al.add(27.8);
        al.add(100);
        al.add(false);

       // System.out.println("First arrayList is : "+al);

        //Now Creating seceon arraylist and will add all elements from first arraylist to second

        ArrayList al2 = new ArrayList();



        al2.addAll(al);
        System.out.println("seceond Arraylist is : "+al2);

        System.out.println("Removing second element from second Arraylist");

        al2.remove(1);
        System.out.println("After removing Arraylist becomes : "+al2);


        System.out.println("Printing first arraylist to check it is unaffected "+al);

        System.out.println("Removing all elements from second ArrayList");
        al2.removeAll(al);

        System.out.println("After removing ArayList becomes : "+al2);
        System.out.println("First Arraylist is : "+al);


    }
}

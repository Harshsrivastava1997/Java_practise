package test.Collection.ArrayList;
import java.util.ArrayList;

public class Arraylist {

    public static void main(String[]args)
    {
        ArrayList  al = new  ArrayList();

        //Adding Elements to ArrayList
        al.add(25);
        al.add("Harsh");
        al.add(true);
        al.add('a');
        al.add(23.75);
        al.add(false);
        al.add("Srivastava");

        System.out.println(al);

        //printing size of ArrayList
        System.out.println("Size of ArrayList is: "+al.size());

        //Removing elements from ArrayList

        al.remove(6); //removing by  index
        al.remove(false); // removing by value

        System.out.println("After removing 1 element : "+al + " size after removal is: "+al.size());

        //Inserting element at specified location

        al.add(3,"python");
        al.add(5,"Java");

        System.out.println("After inserting elements :"+al);

        //Change/Replace element in ArrayList

        al.set(4,"C#");
        System.out.println("After replacing element: "+al);


        //Retrieving element from Arraylist
        System.out.println("Retrieving 2nd location element : "+al.get(2));

        //Searching element in ArrayList
        System.out.println("Is C# present or not: "+al.contains("C#"));

        //Checking Arraylist is empty or not
        System.out.println("Arraylist is empty or not: "+al.isEmpty());
    }
}

package test.Collection.LinkedList;

import java.util.LinkedList;

public class AcessingLinkedListUsingForLoop {
    public static void main(String[]args)
    {
        LinkedList ll = new LinkedList();
        ll.add(3);
        ll.add("Harsh");
        ll.add("true");
        ll.add('a');
        ll.add(28.8);
        ll.add(null);

        //acess using for loop

        for(int i=0;i <ll.size();i++)
        {
            System.out.println("Accessed element is : "+ll.get(i));
        }
    }
}

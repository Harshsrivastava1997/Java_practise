package test.Collection.ArrayList;

import java.util.ArrayList;

public class ConvertingArrayToArrayList {
    public static void main(String[]args)
    {
        String arr[]= {"Java","Selenium","Python","Ruby"};

        ArrayList<String> al = new ArrayList<String>();

        // converting array to arraylits
          for( String arrEle : arr)
          {
              al.add(arrEle);
          }
          System.out.println("ArrayList elements are : " +al);
    }
}

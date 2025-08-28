package test.BasicJavaCodes;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

          int arr_length= a.length;


          System.out.println("After reverse arrays is : ");

          for(int i=arr_length-1;i>=0;i--)
          {
              System.out.print(a[i]+ " ");
          }


    }
}
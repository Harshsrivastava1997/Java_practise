package test.BasicJavaCodes;

public class MissingNumber {
    public static void main(String[]args)
    {
        int ar[]={2,3,4,5,7,8};
        //Find sum all elements ins array and substract it from sum of n number ins array

        //Sum of given elements of arrays is
         int sum =0;
         for(int i=0;i<ar.length;i++)
         {
             sum=sum+ar[i];
         }
         System.out.println("sum of elements of array is : "+sum);
         //sum of n number is :Sum= n/2(2*a+((n-1)*d))

        int a=ar[0];
        int n= ar.length+1;
        int d= ar[1]-ar[0];

        int Sn=(n*((2*a)+((n-1)*d)))/2;
        System.out.println("Sum of n elements is : "+Sn);
        int miss= Sn-sum;


        System.out.println("Missing number is : "+miss);

    }
}

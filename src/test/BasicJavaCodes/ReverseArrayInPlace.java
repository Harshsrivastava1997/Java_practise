package test.BasicJavaCodes;

//Two pointers approach will be used here

public class ReverseArrayInPlace {
    public static void main(String[]args)
    {
        int []arr={10,20,30,40,50,60};

        int left=0;
        int right=arr.length-1;

        while(left<right)
        {
            int flag=arr[left];
            arr[left]=arr[right];
            arr[right]=flag;

           left++;
           right--;

        }
        System.out.println("After reverse array is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}

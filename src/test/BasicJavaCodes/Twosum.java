package test.BasicJavaCodes;

public class Twosum {
    public static void main(String[]args)
    {
        int target =10;
        int arr[]={2, 7, 4, -5, 11, 5, 20,8,15,3};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("Pairs found "+arr[i]+" "+arr[j]);
                }
            }
        }
    }
}

package test.BasicJavaCodes;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 50, 6, 7, 800, 100, 9, -10, 5};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println("Largest number in this array is : "+max);


    }
}
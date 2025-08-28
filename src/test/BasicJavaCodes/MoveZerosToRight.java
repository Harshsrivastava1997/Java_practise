package test.BasicJavaCodes;

public class MoveZerosToRight {
    public static void main(String[] args) {
        int[] arr = {0, 3, 0, 1, 0, 5, 0, 6, 2};
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            while(arr[left]!=0 && right>left)
            {
                left++;
            }
            while(arr[right]==0 && right>left)
            {
                right--;
            }
            if(left<right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        for(int j:arr)
        {
            System.out.print(j+" ");
        }
    }
}
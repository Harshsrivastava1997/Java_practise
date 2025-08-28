package test.BasicJavaCodes;

public class leaderinArray {
    public static void main(String[]args)
    {
        int []lead={16, 17, 4, 3, 5, 2};
        int size=lead.length;
        int leader=lead[size-1];
        System.out.println(leader);
        for(int i=size-2;i>=0;i--)
        {
            if(lead[i]>leader)
            {

                leader =lead[i];
                System.out.println(leader);
            }


        }

    }
}

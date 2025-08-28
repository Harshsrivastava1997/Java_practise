package test.BasicJavaCodes;

public class SmallestNumberInArray {
    public static void main(String[]args)
    {
        int arra[]={102,-102,23,-25,0,90,-1000};
        int min=arra[0];
        for(int i=1;i<arra.length;i++)
        {
            if(arra[i]<min)
            {
                min=arra[i];
            }
        }
        System.out.println("smallest number int this Array is : "+min);
    }
}

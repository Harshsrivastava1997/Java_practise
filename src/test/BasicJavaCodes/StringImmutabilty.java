package test.BasicJavaCodes;

public class StringImmutabilty {
    public static void main(String[]args)
    {
        String s1="Hello";
        s1. concat("World");
        String s2 = s1.concat(" world");

        System.out.println(s1); // String is immutable
        System.out.println(s2); // new string is created
    }
}

import java.util.Scanner;

class A
{
    public static void main(String[] args) 
    {   
        System.out.println("Default Array Value:");

        Scanner sc = new Scanner(System.in);   
        int[] x = new int[5];
        
        for(int i=0; i<x.length ; i++)
            
        {System.out.println(x[i]);}

        System.out.println("======================================================");

        System.out.println("Enter the Array Value:");

        for(int i=0; i<x.length ; i++)
        
        { x[i] = sc.nextInt(); }

        System.out.println("======================================================");
        
        System.out.println("Final values in Array:");


        for(int i=0; i<x.length ; i++)
        
        { System.out.println(x[i]); }
    }
}
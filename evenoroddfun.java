import java.util.Scanner;

public class evenoroddfun {
    public static int EvenOrOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println("its even");
        }
        else
        {
           System.out.println("Its odd!!"); 
        }
        return 0;

    }
    public static void main ( String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        EvenOrOdd(n);
    }
    
}

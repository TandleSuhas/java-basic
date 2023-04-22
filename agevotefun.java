import java.util.Scanner;

public class agevotefun 
{
    public static int AgeVote(int n)
    {
        if(n>=18)
        {
           System.out.println("They are elgible to vote");
        }
        else
        {
            System.out.println("They are not elgible to vote");

        }
        return 0;

    }
    public static void main(String args[])
     {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       AgeVote(n);
     }
 }

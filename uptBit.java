import java.util.*;

public class uptBit 
{
    public static void main(String args[])
    {
        System.out.println("Enter the number n :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the position :");
        int pos=sc.nextInt();
        System.out.println("Enter the opertion :");
        int oper=sc.nextInt();
         
        int bitMask=1<<pos;
       
         if(oper==1)
         {
            int newNumber= bitMask | n;
            System.out.println(newNumber);
         }

         else
         {
            int notbitMask=~(bitMask);
            int newNumber2=notbitMask & n;
            System.out.println(newNumber2);
         }
        }
    }
import java.util.*;

public class clearBit 
{
    public static void main(String args[])
    {
        System.out.println("Enter the number n :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the position :");
        int pos=sc.nextInt();
        
        int bitMask=1<<pos;
        int notbitMask=~(bitMask);
        int newNumber=notbitMask & n;
        System.out.println(newNumber);
    }
}

        
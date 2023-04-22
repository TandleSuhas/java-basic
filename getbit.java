import java.util.*;

public class getbit {
    public static void main(String args[]){
        System.out.println("Enter the number n :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the position :");
        int pos=sc.nextInt();
      
        int bitMask=1<<pos;
        if((bitMask & n)==0)
        {
            System.out.println("Bit was zero");
        }
        else
        {
            System.out.println("Bit was one");

        }
    }
}

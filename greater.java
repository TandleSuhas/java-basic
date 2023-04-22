import java.util.*;
public class greater {
    public static void main(String arg[]){
        System.out.println("Enter the num");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a == b)
        {
            System.out.println("It is equal");
        }
        else if(a>b)
        {
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }

    }
}

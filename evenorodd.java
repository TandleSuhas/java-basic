import java.util.*;
public class evenorodd {
    public static void main(String arg[]){
        System.out.println("Enter the num");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("It is even!!");
        }
        else{
            System.out.println("It is odd!!");
        }

    }
}

import java.util.Scanner;
public class age {
    public static void main(String args[]){
        System.out.println("Enter the age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("Elder one!!");
        }
        else{
            System.out.println("Younger one!!");

        }
    }
}

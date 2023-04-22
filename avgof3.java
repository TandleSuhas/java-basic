import java.util.Scanner;

public class avgof3 {
    public static int AvgFun(int a,int b,int c){
           int avg=(a+b+c)/3;
           System.out.println("The avgerage of three numbers is :"+avg);
           return 0;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       
        AvgFun(a,b,c);
    }
}

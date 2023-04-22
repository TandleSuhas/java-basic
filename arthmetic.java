import java.util.Scanner;
class arthmetic2{
    public static void main(String[] args)
    {
      System.out.println("Enter two numbers");
      Scanner sc=new Scanner (System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();

       int sum=a+b;
       int diff=a-b;
       int mul=a*b;
       int div=a/b;
       int mod=a%b;

       System.out.println(sum);
       System.out.println(diff);
       System.out.println(mul);
       System.out.println(div);
       System.out.println(mod);
    }
}
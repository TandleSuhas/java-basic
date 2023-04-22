import java.util.Scanner;

public class radiusfun {
    public static double RadiusFun(double r)
    {
       
        double circumference=2 * Math.PI * r;
        System.out.println("The circumference of cicle is :"+circumference);
        return circumference;
    }
    public static void main(String args[])
    {
        System.out.println("Enter the Radius");
        Scanner sc=new Scanner(System.in);
        double r=sc.nextFloat();
        System.out.println("The Radius is "+r);
        
        RadiusFun(r);

    }
}

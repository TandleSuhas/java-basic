import java.util.*;


public class revste 
{
   public static void main(String args[]) 
   {
     System.out.println("Enter the string");
     Scanner sc=new Scanner(System.in);

     StringBuilder sb = new StringBuilder("");
    
     for(int i=0; i<sb.length()/2; i++) 
     {
       int front = i;
       int back = sb.length()-i-1;


       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);


       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }


     System.out.println(sb);
   }
}

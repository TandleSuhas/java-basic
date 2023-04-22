import java.util.*;

public class BubbleSortIn
{
    public static void printArray(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {   
        System.out.println("Enter the size of the array: ");  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
          ar[i]=sc.nextInt();  
        }  
        System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++)   
        {  
        System.out.print(ar[i]+" ");  
        }  
        System.out.println();  

        System.out.println("The Sorted Elements are: ");  
        
        //bubble sort
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0;j<ar.length-i-1;j++)
            {
              if(ar[j]>ar[j+1])
              {
                int temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
              }
            }     

        }
        printArray(ar);
    } 
}

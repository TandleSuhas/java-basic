import java.util.*;


class InsertionSortIn 
{
   public static void printArray(int ar[]) 
   {
       for(int i=0; i<ar.length; i++) 
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
       //insertion sort
       for(int i=1; i<ar.length; i++) 
       {
           int current = ar[i];
           int j = i - 1;
               while(j >= 0 && ar[j] > current)
                {
                   //Keep swapping
                   ar[j+1] = ar[j];
                   j--;
                }
           ar[j+1] = current;
       }
       printArray(ar);
   }
}

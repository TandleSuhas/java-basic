import java.util.*;


class InsertionSort 
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
       int ar[] = {7, 8, 1, 3, 2};


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

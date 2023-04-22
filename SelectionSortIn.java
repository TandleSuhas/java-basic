import java.util.*;


class SelectionSortIn
{
   public static void printArray(int arr[]) 
   {
       for(int i=0; i<arr.length; i++)
       {
           System.out.print(arr[i]+" ");
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


       //selection sort
       for(int i=0; i<ar.length-1; i++) 
       {
           int smallest = i;
           for(int j=i+1; j<ar.length; j++) 
           {
               if(ar[j] < ar[smallest]) 
               {
                   smallest = j;
               }
           }
           //swap
           int temp = ar[smallest];
           ar[smallest] = ar[i];
           ar[i] = temp;
       }


       printArray(ar);
   }
}

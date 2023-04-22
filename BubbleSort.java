import java.util.*;

class BubbleSort 
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
        int ar[]={7, 8, 1, 3, 2};
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

import java.util.*;
class InsertionSort
{
    public static void main(String args[])
    {
        int i,k,n,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        try{
            n=sc.nextInt();
        
        int a[]=new int[n];
        //Taking Input
        for(i=0;i<n;i++)
        {
            System.out.println("Enter element no: "+(i+1));
            a[i]=sc.nextInt();
        }
    
    
        //Sorting Process
        for(i=0;i<n-1;i++)
        {
            for(k=i+1;k<n;k++)
            {
                if(a[i]>a[k])
                {
                    t=a[i];
                    a[i]=a[k];
                    a[k]=t;
                }
            }
        }

        System.out.println("The sorted array is:");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    finally{
        sc.close();
    }
    }
}
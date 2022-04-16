import java.util.*;
class SelectionSort
{
    public static void main(String args[])
    {
        int i,k,n,min,p,t;
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the number of elements");
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
            min=a[i];
            p=i;
            for(k=i+i;k<n;k++)
            {
                if(a[k]<min)
                {
                    min=a[k];
                    p=k;
                }
            }
            if(i!=p)
            {
                t=a[i];
                a[i]=a[p];
                a[p]=t;
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
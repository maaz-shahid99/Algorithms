import java.util.*;
class BubbleSort
{
    public static void main(String args[])
    {
        int i,k,n,t,xx=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        try{
            n=sc.nextInt();
        int a[]=new int[n];
        
        for(i=0;i<n;i++)
        {
            System.out.println("Enter element no: "+(i+1));
            a[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n-1;i++)
        {
            for(k=0;k<n-1;k++)
            {
                if(a[k]>a[k+1])
                {
                    t=a[i];
                    a[i]=a[k];
                    a[k]=t;
                }
            }
            xx++;
        }
        System.out.println("The sorted array is:");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println(xx);
    }
    finally{sc.close();
    }

    }
}
import java.util.*;
class merging
{
    public static void main(String args[])
    {
        int m,n,i,p=0;
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter number of elements of array A");
        m=sc.nextInt();
        System.out.println("Enter number of elements of array B");
        n=sc.nextInt();
        int A[]=new int[m];
        int B[]=new int[n];
        int Y[]=new int[m+n];
        System.out.println("Enter elements of A");
        for(i=0;i<m;i++)
        A[i]=sc.nextInt();

        System.out.println("Enter elements of B");
        for(i=0;i<n;i++)
        B[i]=sc.nextInt();

        //Merging process
        for(i=0;i<m;i++)
        {
            Y[p]=A[i];
            p++;
        }

        for(i=0;i<n;i++)
        {
            Y[p]=B[i];
            p++;
        }

        System.out.println("The elements of merged array are: ");
        for(i=0;i<p;i++)
            System.out.println(Y[i]);
    }
    finally{
        sc.close();
    }
    }
}
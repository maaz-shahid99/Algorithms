import java.util.*;
class inserting
{
    public static void main(String args[])
    {
        int n,i,x,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        try{
            n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array A");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the element and it's position to insert");
        x=sc.nextInt();
        p=sc.nextInt();
        p--;
        //Inserting process
        if(p>=0 && p<=n)
        {
            int b[]=new int[n+1];
            for(i=0;i<=n;i++)
            {
                if(i<p)
                    b[i]=a[i];
                else if(i==p)
                    b[i]=x;
                else
                    b[i]=a[i-1];
            }

            System.out.println("Elements of Array");
            for(i=0;i<=n;i++)
                System.out.println(b[i]);
        }
        else
            System.out.println("Invalid Position");
    }
    finally{
        sc.close();
    }
    }
}
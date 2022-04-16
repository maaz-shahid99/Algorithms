import java.util.*;
class deleting
{
    public static void main(String args[])
    {
        int n,i,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        try{
            n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter position of deletion");
        p=sc.nextInt();
        p--;
        //Deleting process
        if(p>=0 && p<n)
        {
            int b[]= new int[n-1];
            for(i=0; i<n-1;i++)
            {
                if(i<p)
                b[i]=a[i];
                else
                b[i]=a[i+1];
            }
            System.out.println("The array elements are: ");
            for(i=0;i<n-1;i++)
                System.out.println(b[i]);
        }
        else
            System.out.println("Invalid Position");
    }
    finally
    {
        sc.close();
    }
    }

}
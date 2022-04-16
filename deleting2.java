import java.util.*;
class deleting2
{
    public static void main(String args[])
    {
        int n,i,x,p=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        try{
            n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter the element to be deleted");
        x=sc.nextInt();

        //Searching Process
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
                p=i;
        }

        //Deleting process
        if(p>=0 && p<n)
        {
            int b[]=new int[n-1];
            for(i=0;i<n-1;i++)
            {
                if(i<p)
                    b[i]=a[i];
                else
                    b[i]=a[i+1];
            }
            System.out.println("The new array is:");
            for(i=0;i<n-1;i++)
                System.out.println(b[i]);
        }
        else
        System.out.println("Element to be deleted not found");
    }
    finally{
        sc.close();
    }
    }
}
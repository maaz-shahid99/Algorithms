import java.util.*;
class LinearSearch
{
    public static void main(String args[])
    {
        int n,i,s,f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        
        try{
            //Inputs
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter ascending order sorted array");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the element to search");
        s=sc.nextInt();

        for(i=0;i<n;i++)
        {
            if(a[i]==s)
            {
                System.out.println(s+" is found at position: "+(i+1));
                f=1;
            }
        }
        if(f==0)
        System.out.println(s+ " Element not found");
    }
    finally{
        sc.close();
    }
    }
}

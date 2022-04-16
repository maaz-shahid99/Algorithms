import java.util.*;
class BinarySearch
{
    public static void main(String args[])
    {
        int n,i,s,f=0,lb,ub,mid;
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
        lb=0; ub=n-1;
        
        //Searching process
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(a[mid]==s)
            {
                System.out.println(s+" is found at pos: "+(mid+1));
                f=1;
            }

            if(a[mid]<s)
                lb=mid+1;
            else
                ub=mid-1;
        }

        if(f==0)
        System.out.println(s+" is not found");

       }
       finally{
        sc.close();
       } 
        
    }
}
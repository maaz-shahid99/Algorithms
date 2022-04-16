import java.util.*;
class splitting
{
    public static void main(String args[])
    {
        int i,n,p1=0,p2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        try{
            n=sc.nextInt();
        int A[]=new int[n];
        int EV[]=new int[n];
        int OD[]=new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
            A[i]=sc.nextInt();
        //Splitting process
        for(i=0;i<n;i++)
        {
            if(A[i]%2==0)
            {
                EV[p1]=A[i];
                p1++;
            }
            else
            {
                OD[p2]=A[i];
                p2++;
            }
        }
        System.out.println("The even elements are:");
        for(i=0;i<p1;i++)
            System.out.println(EV[i]);
        
        System.out.println("The odd elements: ");
        for(i=0;i<p2;i++)
            System.out.println(OD[i]);
    }
    finally{
        sc.close();
    }
    }

}
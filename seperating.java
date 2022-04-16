import java.util.*;
class seperating {
 
    public static void main(String args[]) {
        
        int n , i, left=0, right;
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter the number of array elements");
            n = sc.nextInt();
            right=n-1;
            int a[]= new int[n];

            System.out.println("Enter the array elements");
            for(i=0; i<n; i++)
            a[i]=sc.nextInt();

            while(left <= right)
            {
                if(a[left]>0 && a[right]<0)
                {
                    swap(a, left, right);
                    left++; right--;
                }

                else if(a[left]>0 && a[right]>0)
                    right--;

                else if(a[left]<0 && a[right]<0)
                    left++;

                else
                {
                    left++;
                    right--;
                }
            }

            printArray(a, n);
        }

        finally{
            sc.close();
        }
        
    }

    static int[] swap(int arr[], int x1, int x2)
    {
        int temp;
        temp = arr[x1];
        arr[x1] = arr[x2];
        arr[x2] = temp;

        return arr;
    }

    static void printArray(int arr[], int n)
    {
        int i;
        for(i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}

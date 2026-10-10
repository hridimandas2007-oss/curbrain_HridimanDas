import java.util.Scanner;

public class Q8 {
    static int[] sort(int arr[])

    { for(int i=1;i<=arr.length-1;i++)
    {
        for(int j=1;j<=arr.length-1-i;i++)
        {
          if(arr[j]>arr[j+1])
          { 
            int temp=arr[j+1];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

          }
        }
    }
    return arr;
    }
    public static void main(String[] args) {
        int n,k;
        
        Scanner ab=new Scanner(System.in);
        System.out.println("enter number and kth factor");
        n=ab.nextInt();
        k=ab.nextInt();
        int c=0;int i;
        for( i=1;i<=n;i++)
        {  
             if(n%i==0)
             c++;
        }
        int arr[]=new int[c];
        int t=0;

        for( i=1;i<=n;i++)
        {   if(n%i==0)
           { arr[t]=i;
                t++;
           }

        }
        arr=sort(arr);
        if(arr.length<k)
            System.out.println("-1");
        else
            System.out.println(arr[k-1]);
        

        
        ab.close();
    }
}


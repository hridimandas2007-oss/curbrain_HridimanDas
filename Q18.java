import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int n,i,j,a,b,t;
        System.out.println("enter array range:");
        n=ab.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=ab.nextInt();
        }
        System.out.println("enter 2 indices:");
        a=ab.nextInt();
        b=ab.nextInt();
        for(i=a,j=b;i<j;i++,j--)
        {
            t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        for(i=0;i<n;i++)
        {
        System.out.print(arr[i]+" ");
        }
        


        ab.close();
    }
}

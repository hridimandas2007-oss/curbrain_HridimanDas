import java.util.*;
public class Q7 {
       static int gcd(int a,int b)
       { int d=1;
        while(d!=0)

        {
           d=a%b;
           a=b;
           b=d; 
            
        }
        return b;
       }
    public static void main(String[] args) {
        int r;
        Scanner ab= new Scanner(System.in);
        
        System.out.println("enter array range: ");
        
        r=ab.nextInt();
        int a[]=new int[r];
        System.out.println("enter array elements: ");
        for(int i=0;i<r;i++)
        {
            a[i]=ab.nextInt();
        }
        
        
        ab.close();
    }
}

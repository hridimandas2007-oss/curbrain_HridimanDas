import java.util.Scanner;

public class Q9 {
   static  boolean check (int n)
   { int c=0;
        for(int i=1;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
                c++;
            
        }
        if(c>1)
        
            return false;
        else 
            return true;

   }
   public static void main(String[] args) {
         Scanner ab=new Scanner(System.in);
         int n;
        System.out.println("enter number");
        n=ab.nextInt();
        for(int i=n+1;i>n;i++)
            {
                if(check(i)==true)
                {
                    System.out.println(i);
                    break;
                }
            }
        ab.close();
   }
}

// package curbrain_HridimanDas;
import java.util.*;
public class Q1 {
    static boolean check(int n)
        { int c=0;
            while(n!=0)
            {
                c++;
                n=n/10;

            }
            if (c==4)
            return true;
        else 
            return false;
        }
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int n;
        n=ab.nextInt();
        System.out.println(check(n));
        ab.close();
    }
}

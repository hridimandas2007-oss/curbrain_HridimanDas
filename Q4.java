// package curbrain_HridimanDas;

import java.util.Scanner;

public class Q4 {
    static int calc(int n)
    {
        int d,s=0,p=1;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
        int diff=0;
        diff=p-s;
        return diff;

    }
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int n;
        n=ab.nextInt();
        System.out.println(calc(n));
        ab.close();

    }
}

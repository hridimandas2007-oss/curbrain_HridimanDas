// package curbrain_HridimanDas;

import java.util.Scanner;

public class Q6 {
    static int freq(int n,int a,int b)
    {
        int d,ca=0,cb=0;
        while(n!=0)
        {
            d=n%10;
            if(d==a)
                ca++;
            else if(d==b)
                cb++;
            n=n/10;
        }
        int diff;
        diff=(int)Math.abs((ca-cb));
        return diff;
    }
    public static void main(String[] args) 
    { 
        Scanner ab=new Scanner(System.in);
        int n,a,b;
        n=ab.nextInt();
        a=ab.nextInt();
        b=ab.nextInt();
        System.out.println(freq(n, a, b));


    }
}

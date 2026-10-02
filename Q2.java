// package curbrain_HridimanDas;

import java.util.Scanner;

public class Q2 {
    static int reverse_and_double(int n)
    {   int r=0,d;
        while(n!=0)
        {
            d=n%10;
            r=(r*10)+d;
            n=n/10;

        }
        return (r*2);
    }
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int n;
        n=ab.nextInt();
        System.out.println(reverse_and_double(n));
        ab.close();
    }
}

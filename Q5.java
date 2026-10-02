// package curbrain_HridimanDas;

import java.util.Scanner;

public class Q5 {
    static void rep(int n)
    {   int c=0,temp=n;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        n=temp;
        int d,i;
        int a[]=new int[c];
        for(i=c-1;i>=0;i--)
        {
           d=n%10;
           if(d%2 != 0)
           a[i]=d;
        else
            a[i]=0;

           n=n/10;


        }
        for( i=0;i<c;i++)
        System.out.print(a[i]);
    }
    public static void main(String[] args) 
    { 
        Scanner ab=new Scanner(System.in);
        int n;
        n=ab.nextInt();
        rep(n);


    }
}

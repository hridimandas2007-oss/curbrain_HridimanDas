// package curbrain_HridimanDas;

import java.util.Scanner;

public class Q3 
{   
    static boolean check(int n)
    { int d,r=0,temp=n;

        while(n!=0)
        {
            d=n%10;
            r=(r*10)+d;
            n=n/10;

        }
        if(r==temp)
        return true;
        else
        return false;
    }  
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int n;
        n=ab.nextInt();
        if(check(n)==true)
            System.out.println("pallindrome");
        else
            System.out.println("not pallindrome");


    }  
    
}

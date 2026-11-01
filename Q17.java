import java.util.Scanner;

public class Q17 {
    public static void main(String[]args)
    {
        Scanner ab=new Scanner(System.in);
        int m,i,c=0,j,fm=0,fmn=0;
        System.out.println("enter array range:");
        m=ab.nextInt();
        int arr[]=new int[m];
        System.out.println("enter product ids:");
        for(i=0;i<m;i++)
        {   arr[i]=ab.nextInt();
        
        }
        for(i=0;i<m;i++)
        {
            for( j=0;j<m;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
                if(c>=fm)
                {
                    fm=c;
                    fmn=arr[i];
                }
            c=0;
        }

        for(i=0;i<m;i++)
        {
             for( j=0;j<m;j++)
            {
            if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==fm)
            {
                if(arr[i]<fmn)
                {
                    fmn=arr[i];
                }
            }c=0;
        }
        System.out.println(fmn);
        ab.close();

    }
}

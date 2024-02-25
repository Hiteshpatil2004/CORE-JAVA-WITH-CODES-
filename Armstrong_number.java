import java.util.Scanner;
import java.lang.Math;

class Armstrong_number
{
    public static void main(String[] args) 
    
    {
        double p,sum;
        int n,count=0,rem,temp;
        sum=0;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the number you want");

        n=sc.nextInt();

        temp=n;

        while(n>0)
        {
            n=n/10;

            count++;
        }

        System.out.println("no. of digit= "+count);

        n=temp;

        while(n>0)
        {
            rem=n%10;
            p=Math.pow(rem, count);
            sum=sum+p;
            n=n/10;
        }

        System.out.println("sum= "+sum);

        if(sum==temp)
        {
            System.out.println("number is armstrong");
        }
        else
        {
            System.out.println("number is not armstrong");
        }
    }
}

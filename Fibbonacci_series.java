import java.util.Scanner;

class Fibbonacci_series
{
    public static void main(String[] args) 
{
    int f=0,s=1,next,i,n;

    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the number you want");

    n=sc.nextInt();

    for(i=0;i<n;i++)
    {
        if(i<=1)
        {
            next=i;
        }
        else
        {
            next=f+s;
            f=s;
            s=next;
        }

        System.out.println(next+" ");
    }
}
    
}

import java.util.Scanner;

class Revers
{
    public static void main(String args[])
{
    int a;
    
   
    int rem;


    Scanner ob=new Scanner(System.in);

    System.out.println("enter you want reserve");

    a=ob.nextInt();

    int temp=a;
    int rev_no=0;

    while (a>0) 
    {
       rem=a%10;
       rev_no=(rev_no*10)+rem;
       a=a/10;

    }
    System.out.println(rev_no);
}
}

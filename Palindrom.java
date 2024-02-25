//the  reverse no is equal to given no called palindrom number//


import java.util.Scanner;

class Palindrom
{
    public static void main(String args[])
    {
        int n,temp,rev_no=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter value you want");
        n=sc.nextInt();
        temp=n;

        while (n>0) 
        {
            int rem=n%10;
            rev_no=(rem*10)+rem;
            n=n/10;   
        }

        System.out.println("reverse number is:- "+rev_no);

        if(rev_no==temp)
        {
            System.out.println("given number is palindrom");
        }
        else
        {
            System.out.println("given number id=s not palindrom");
        }
    }
}

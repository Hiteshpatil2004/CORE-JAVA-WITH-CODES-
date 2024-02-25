import java.util.Scanner;

class Ladder
{
    public static void main(String args[])
    {
        int a,b,c;

        Scanner cd=new Scanner(System.in);

        System.out.println("enetr the value of A");
        a=cd.nextInt();

        System.out.println("enetr the value of B");
        b=cd.nextInt();

        System.out.println("enetr the value of C");
        c=cd.nextInt();

        if(a>b && a>c)
        {
            System.out.println("***a is greater***");
        }
        else if(b>c)
        {
            System.out.println("b is greater");
        }
        else 
        {
            System.out.println("***c is grater***");
        }
    
    }
}

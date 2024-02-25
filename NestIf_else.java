import java.util.Scanner;


class NestIf_else
{
    public static  void main(String args[])
    {
        int n;

        Scanner ab=new Scanner(System.in);

        System.out.println("enter the value of n");

        n=ab.nextInt();

        if(n==0)
        {
            System.out.println("n is equal to zero");
        }
        else
        {
            System.out.println("n is non-zero");

            if(n>0)
            {
                System.out.println("n is positive");
            }
            else
            {
                System.out.println("n is negative");
            }
        }
    }
}

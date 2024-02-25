import java.util.Scanner;

class If_else
{
    public static void main(String[] args) 
{
    int n;
    Scanner ob=new Scanner(System.in);
    System.out.println("enter the no. you want");
    n=ob.nextInt();

    if(n==0)
    {
        System.out.println("give no is equal to zero");
    }
    else
    {
        System.out.println("give no. not equal to zero");
    }
}
}

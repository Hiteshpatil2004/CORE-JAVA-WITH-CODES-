import java.util.Scanner;

class Do_loop
{
    public static  void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value you want");
        i=sc.nextInt();

        do
        {
            System.out.println(i+" ");
            i++;
        }
        while(i<=10);
    }
}

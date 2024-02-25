import java.util.Scanner;
class Arrays
{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);

        int i;

        int[] a=new int[5];

        System.out.println("enter the array element");

        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("array element are:--");
        
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}

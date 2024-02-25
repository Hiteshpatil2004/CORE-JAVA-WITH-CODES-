import java.util.Scanner;

class Forloop
{
        public static void main(String[] args) 
    
    {
        int n,i;

        Scanner ob=new Scanner(System.in);


        System.out.println("enter no.you want");

        n=ob.nextInt();

        for(i=0;i<=n;i++)
        {
            System.out.println(i+" ");
        }
        System.err.println( );
    }
}

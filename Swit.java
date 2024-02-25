//using switch we form a mcq test
import java.util.Scanner;

class Swit
{
    public static void main(String args[])
{
    int n;

    Scanner sc=new Scanner(System.in);

    System.out.println("***which is the following is correct syntax of input character***:-");

    System.out.println("1)next.charAt()");
    System.out.println("2)next()");
    System.out.println("3)nextLine()");
    System.out.println("4)next.char()");

    System.out.println("***choose the above***");

    n=sc.nextInt();

    switch (n) 
    {
        case 1: System.out.println("CORRECT");
        break;
        case 2: System.out.println("wrong");
        break;
        case 3: System.out.println("wrong");
        break;
        case 4: System.out.println("wrong");
        break;
        default: System.out.println("INVALID CHOICE");
            break;
    }
}
}

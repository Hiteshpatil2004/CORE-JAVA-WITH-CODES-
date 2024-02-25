//create object to give input for print
//for that we use Scanner class

import java.util.Scanner;
class Object
{
  public static void main(String args[])
{
  String name;

  Scanner ob=new Scanner(System.in); //create object

  System.out.println("enter the name you want");

  name=ob.next();

  System.out.println(name);

}
}

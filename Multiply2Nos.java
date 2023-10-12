//multiply two numbers
package basic;
import java.util.Scanner;
public class Multiply2Nos
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the nos:");
        a= s.nextInt();
        b= s.nextInt();
        c=a*b;
        System.out.println("product of given two numbers is: "+c);
    }
}

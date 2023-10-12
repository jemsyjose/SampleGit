//area of the triangle
package basic;
import java.util.Scanner;
public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        int b,h,area;
        Scanner s=new Scanner(System.in);
        System.out.println("base of the triangle:");
        b=s.nextInt();
        System.out.println("height of the triangle:");
        h=s.nextInt();
        area=(b*h)/2;
        System.out.println("area of the triangle is : "+area);

    }
}

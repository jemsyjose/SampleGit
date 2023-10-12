//area of circle
package basic;
import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String[] args)
    {
        int r;
        float area;
        Scanner s=new Scanner(System.in);
        System.out.println("radius of the circle: ");
        r=s.nextInt();
        area=3.14f*r*r;
        System.out.println("area of the circle is: "+area);
    }
}

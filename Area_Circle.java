//Write a program to accept radius from user and find out the area of circle and circumstances of circle
import java.util.*;
class Area_Circle
{
    public static void main(String[] args)
    {
            double rad,area,cir,pie=3.14;
            System.out.print("Enter the Radius of circle to find the Area of circle : ");
            Scanner sc = new Scanner(System.in);
            r = sc.nextDouble();
            area = pie*(rad*rad);
            cir = 2*(pie*rad);
            System.out.println("Area of Circle is : "+area);
            System.out.println("Circumference of Circle is :  "+cir);
    }
}
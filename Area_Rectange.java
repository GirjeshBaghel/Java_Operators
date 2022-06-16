//Write a program to accept length and breath from user and calculate area of rectangle and perimeter of rectangle
import java.util.*;
class Area_Rectange
{
    public static void main(String[] args)
    {
        double l,b,area,peri;
        System.out.print("Enter the Lenth of Rectangle : ");
        Scanner sc = new Scanner(System.in);
        l = sc.nextDouble();
        
        System.out.print("Enter the Breath of Rectangle : ");
        b = sc.nextDouble();
        
        area = l*b;
        peri = 2*(l+b);
        System.out.println("Area of Rectangle is : "+area);
        System.out.println("Perimeter of Rectangle is : "+peri);
   }
}
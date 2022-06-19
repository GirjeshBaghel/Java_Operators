//Write a program to accept length and breath from user and calculate area of rectangle and perimeter of rectangle
import java.util.*;
class Area_Rectange
{
    public static void main(String[] args)
    {
        double l,b,area,peri;
        // taking the length from user
        System.out.print("Enter the Lenth of Rectangle : ");
        Scanner sc = new Scanner(System.in);
        l = sc.nextDouble();
        
        // taking the breath from user
        System.out.print("Enter the Breath of Rectangle : ");
        b = sc.nextDouble();
        
        // formula of area of reactangle
        area = l*b;
        
        // formula of permiter of rectangle
        peri = 2*(l+b);
        System.out.println("Area of Rectangle is : "+area);
        System.out.println("Perimeter of Rectangle is : "+peri);
   }
}

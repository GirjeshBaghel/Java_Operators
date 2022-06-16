//Write a program to accept principal amount,  rat of interest,  no of years from user and calculate Simple interest
import java.util.*;
class Simple_Interest
{
    public static void main(String[] args)
    {
        double p,r,t,si;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Pricipal Amount : Rs ");
        p = sc.nextDouble();
        
        System.out.print("Please enter the Rate of Interest : % ");
        r = sc.nextDouble();
        
        System.out.print("Please enter the Time period in Years :  ");
        t = sc.nextDouble();
        si = p*(1+(r*t));
        
        System.out.println("Simple Interest is : "+si);


    }
}

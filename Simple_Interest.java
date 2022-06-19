//Write a program to accept principal amount,  rat of interest,  no of years from user and calculate Simple interest
import java.util.*;
class Simple_Interest
{
    // main method
    public static void main(String[] args)
    {
        double p,r,t,si;
        Scanner sc = new Scanner(System.in);
        
        // taking principal amount from user
        System.out.print("Please enter the Pricipal Amount : Rs ");
        p = sc.nextDouble();
        
        // taking rate of interset from user
        System.out.print("Please enter the Rate of Interest : % ");
        r = sc.nextDouble();
        
        // taking time period from user
        System.out.print("Please enter the Time period in Years :  ");
        t = sc.nextDouble();
        
        // formula of simple interset
        si = p*(1+(r*t));
        
        System.out.println("Simple Interest is : "+si);


    }
}

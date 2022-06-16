//Write a program to accept a no from user if no is even than find out the cube
import java.util.*;
class Cube_EvenNo
{
    public static void main(String[] args)
    {
        int a;
        System.out.print("Enter a no : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a == 0)
        {
            System.out.println("The no is neither positive nor negative.. Please Enter the corrext value");
        }

        else if(a%2 == 0)
        {
            System.out.println("The value is even and Cude of no is : "+a*a*a);
        }
        else{
            System.out.println("The value is negative value please enter the correct value");
        }

    }
}
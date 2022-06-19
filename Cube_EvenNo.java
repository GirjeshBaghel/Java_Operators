//Write a program to accept a no from user if no is even than find out the cube
import java.util.*;
class Cube_EvenNo
{
    public static void main(String[] args)
    {
        int a;
        
        // taking a no from user
        System.out.print("Enter a no : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        // checking no will not be zero
        if(a == 0)
        {
            System.out.println("The no is neither positive nor negative.. Please Enter the corrext value");
        }
        
        // checking no is even or not, if even them print cube of that no
        else if(a%2 == 0)
        {
            System.out.println("The value is even and Cude of no is : "+a*a*a);
        }
        
        // if no is not even then print this line
        else{
            System.out.println("The value is negative value please enter the correct value");
        }

    }
}

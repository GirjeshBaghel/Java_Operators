//Calculator by Switch_Case
import java.util.*;
class Switch_Case
{
    public static void main(String[] args)
    {
        int a,b,choice;
        
        //taking  a two no from user
        System.out.print("Enter the Two No : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        //taking a input from user to choose the option         
        System.out.println("Enter your Choice \n 1.Addition : +\n 2.Subtraction : -\n 3.Multiplication : *\n Division : /\n Modulas : %");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Your Addition output is : "+(a+b));
            break;

            case 2:
            System.out.println("Your Substraction output is : "+(a-b));
            break;

            case 3:
            System.out.println("Your Multiplication output is : "+(a*b));
            break;

            case 4:
            System.out.println("Your Division output is : "+(a/b));
            break;

            case 5:
            System.out.println("Your Modulas output is : "+(a%b));
            break;

            default:
            System.out.println("Please enter the correct no !!!");
            break;
        }
        

    }
}
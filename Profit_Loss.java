//Write a program to accept selling price and cost price for user and find out profit or loss.
import java.util.*;
class Profit_Loss
{
    // main method
    public static void main(String[] args)
    {
        int sp,cp;
        Scanner sc = new Scanner(System.in);
        
        // taking selling price from user
        System.out.print("Enter the Selling Price here : ");
        sp = sc.nextInt();

        // taking cost price from user
        System.out.print("Enter the Cost Price here : ");
        cp = sc.nextInt();
        
        // checking selling is greater or not
        if(sp>cp)
        {
            System.out.println("Profit by : "+(sp-cp));
        }

        else
        System.out.println("Loss by : "+(sp-cp));

    }

    
}

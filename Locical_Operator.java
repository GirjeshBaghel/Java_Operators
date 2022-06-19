import java.util.Scanner;
class Locical_Operator
{
    // mmain method
    public static void main(String[] args)
    {
            int a,b;
            // taking a no from user
            System.out.print("Enter the two no");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            
            // printing the value of that two no in and,or,not operator
            System.out.println("AND : "+(a>b && b<a));

            System.out.println("OR : "+(a<b || b<a));

            System.out.println("NOT : "+(a>b | b>a));

    }
    
}

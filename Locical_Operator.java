import java.util.Scanner;
class Locical_Operator
{
    public static void main(String[] args)
    {
            int a,b;
            System.out.print("Enter the two no");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.println("AND : "+(a>b && b<a));

            System.out.println("OR : "+(a<b || b<a));

            System.out.println("NOT : "+(a>b | b>a));

    }
    
}
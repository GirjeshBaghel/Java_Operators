import java.util.*;
class Table
{
    // main method
    public static void main(String[] args)
    {
        int a;
        Scanner sc = new Scanner(System.in);

        // which no of table you wants to print
        System.out.print("Please enter the no : ");
        a = sc.nextInt();
        for(int i=1; i<11;i++)
        {
            // pattern to print table
            System.out.println(a+" * "+i+" = "+(a*i));
        }

    }
}

import java.util.*;
class Table
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the no : ");
        a = sc.nextInt();
        for(int i=1; i<11;i++)
        {
            System.out.println(a+" * "+i+" = "+(a*i));
        }

    }
}
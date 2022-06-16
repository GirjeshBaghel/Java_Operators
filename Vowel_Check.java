//Write a programme to accept a character from user and check it is vowel or not using switch case.
import java.util.*;
class Vowel_check
{
    public static void main(String[] args)
    {
        char ch;

        //Taking a input from user
        System.out.print("Enter the Characters : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        //Conditions to check its vowels or consonent
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("It is Vowel : "+ch);
        }

        else
            System.out.print("Is is Consonent : "+ch);
        
    }   
}
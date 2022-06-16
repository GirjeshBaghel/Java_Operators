import java.util.*;
public class Calculator
{
    //main method
	public static void main(String args[])
	{
        //declartion
		Scanner sc = new Scanner(System.in);
		int a,b,d;
		char c;

        //Taking the no from user
		System.out.print("Enter a first no : ");
		a=sc.nextInt();
		

		System.out.print("Enter a second no :  ");
		b=sc.nextInt();
		

        //Conditions
		System.out.println(" Please enter your condition  \n Addition : +\n Subtract : -\n Multiply : *\nDivision : /\n");
		c=sc.next().charAt(0);
        
	     switch(c)
		 {
			case '+':
			d=a+b;
			System.out.println("Addition  :  "+d);
			break;
			
			case '-':
			d=a-b;
			System.out.println("Subtract  : "+d);
			break;
			
			case '*':
			d=a*b;
			System.out.println("Multiply  : "+d);
			break;
			
			case '/':
			d=a/b;
			System.out.println("Division  : "+d);
			break;
			
			default :
			System.out.println("invalid symbol.... ");
	 
		 }
	}

}
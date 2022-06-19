import java.util.*;
public class Mini_Calculator
{
	// main method
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		// taking a first no from user
		System.out.println("Enter first no");
		a = sc.nextInt();
		
		// taking a second no from user
		System.out.println("Enter second no");
		b = sc.nextInt();
		
		c = a+b;
		System.out.println("Addition  : "+c);
		
		c = a-b;
		System.out.println("Subtract  : "+c);
		
		c = a*b;
		System.out.println("Multiply  : "+c);
		
		c = a/b;
		System.out.println("Division  : "+c);
	
	}
}
	

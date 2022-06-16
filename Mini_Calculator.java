import java.util.*;
public class Mini_Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter first no");
		a = sc.nextInt();
		
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
	
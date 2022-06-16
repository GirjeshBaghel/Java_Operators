import java.util.Scanner;
class ATM 
{
	
	static void clrscr()
	{
		
	}
	
	static void printMenu()
	{
		clrscr();
		System.out.print("\n\tSELECT FROM BELOW MENU:\n");
		System.out.print("\nPress 1 for BALANCE Enquiry\n");
		System.out.print("\nPress 2 for Withdraw cash\n");
		System.out.print("\nPress 3 for Deposit Cash\n");
		System.out.print("\nPress 0 to exit\n");
		System.out.print("\nEnter your choice here : ");
	}
	
	static void showBalance(double savingsAccountBalance, double currentAccountBalance)
	{
		clrscr();
		System.out.print("\n\tYOUR ACCOUNT BALANCE\n");
		System.out.print("\nSavings Account Balance : Rs.");
		System.out.print(savingsAccountBalance);
		System.out.print("\n\nCurrent Account Balance : Rs.");
		System.out.print(currentAccountBalance);
		System.out.print("\n\nTotal Account Balance : Rs.");
		System.out.print(savingsAccountBalance + currentAccountBalance);
		System.out.print("\n");
	}
	
	static void printAccountTypeMenu()
	{
		clrscr();
		System.out.print("\n\tSELECT ACCOUNT TYPE\n");
		System.out.print("\nPress 's' for savings account\n");
		System.out.print("\nPress 'c' for current account\n");
		System.out.print("\nEnter your chocie here : ");				
	}
	
	public static void main(String[] args) throws ATMException
	{
		Scanner scan = new Scanner(System.in);
		
		double savingsAccountBalance, currentAccountBalance, amount;
		savingsAccountBalance = 5000.0;
		currentAccountBalance = 5000.0;
		int atmPin;
		char cont = 'y';
		char choice, accountType;
		int count = 3;
		
		do
		{
			try
			{
			clrscr();
			System.out.print("\tWELCOME TO JAVA ATM\n");
			System.out.print("\nEnter you ATM PIN : ");
			
			atmPin = scan.nextInt();
			scan.nextLine();
			
			
			if (atmPin == 1234)
			{
				printMenu();
				choice = scan.next().charAt(0);
				switch(choice)
				{
					case '1':
						showBalance(savingsAccountBalance, currentAccountBalance);
						break;
					case '2':
						printAccountTypeMenu();
						accountType = scan.next().charAt(0);
						switch(accountType)
						{
							case 's':
								System.out.print("\nEnter amount to be withdrawn : ");
								amount = scan.nextDouble();
								scan.nextLine();
								
								if (amount > savingsAccountBalance)
								{
									System.out.print("\nNot enough balance in savings account\n");
								}
								else
								{
									savingsAccountBalance = savingsAccountBalance - amount;
									System.out.print("\nWithdrawing cash. Please collect.\n");
								}
									
								break;
							case 'c':
								System.out.print("\nEnter amount to be withdrawn : ");
								amount = scan.nextDouble();
								scan.nextLine();
								
								if (amount > currentAccountBalance)
								{
									System.out.print("\nNot enough balance in current account\n");
								}
								else
								{
									currentAccountBalance = currentAccountBalance - amount;
									System.out.print("\nWithdrawing cash. Please collect.\n");
								}
								break;
							default:
								System.out.print("\n\nWrong choice for account type.");
						}
						break;
					case '3':
						printAccountTypeMenu();
						accountType = scan.next().charAt(0);
						switch(accountType)
						{
							case 's':
								System.out.print("\nEnter amount to be deopsit : ");
								amount = scan.nextDouble();
								scan.nextLine();
								savingsAccountBalance = savingsAccountBalance + amount;
								System.out.print("\nSavings Account Balance : Rs.");
								System.out.print(savingsAccountBalance);
								System.out.print("\n\n");
								break;
							case 'c':
								System.out.print("\nEnter amount to be deopsit : ");
								amount = scan.nextDouble();
								scan.nextLine();
								currentAccountBalance = currentAccountBalance + amount;
								System.out.print("\nCurrent Account Balance : Rs.");
								System.out.print(currentAccountBalance);
								System.out.print("\n\n");
								break;
							default:
						}
						break;
					case '0':
						System.exit(0);
						break;
					default:
						System.out.print("\nWrong choice...\n");
				}
			}
				else 
				{
					throw new ATMException("Wron try again.....");
				}
			}
			catch(ATMException t)
			{
				System.out.println(t.getMessage());
			}
			catch(NullPointerException t)
			{
				System.out.println("Null string");
			}
			catch(RuntimeException t)
			{
				
				System.out.println("Something is not good. please try again.....");
			}
			count = count - 1;
			System.out.print("\n No of Attempts remaing : ");
			System.out.print(count);
			if(count == 0)
			{
				System.out.print("\n No of attemts are over.\n");
				System.out.print("\n Now exiting from ATM system.\n");
				System.exit(0);
			}
			System.out.print("\nDo you want to continue (y/n) ? ");
			cont = scan.next().charAt(0);
		}
		while(cont == 'y' || cont == 'Y');
		clrscr();			
		
	}
}

class ATMException extends RuntimeException
{
	String message = "Something went wrong.. Please try again later";
	
	public ATMException(String message)
	{
		super(message);
		this.message = message;
	}
	public ATMException()
	{
		super();
	}
	public String getMessage()
	{
		
		return this.message;
	}
}
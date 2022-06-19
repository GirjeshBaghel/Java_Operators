import java.util.Scanner;
class ATM 
{
	// printMenu method
	static void printMenu()
	{
		
		System.out.print("\n\tSELECT FROM BELOW MENU:\n");
		System.out.print("\nPress 1 for BALANCE Enquiry\n");
		System.out.print("\nPress 2 for Withdraw cash\n");
		System.out.print("\nPress 3 for Deposit Cash\n");
		System.out.print("\nPress 0 to exit\n");
		System.out.print("\nEnter your choice here : ");
	}

	// showBalane method with two paramters
	static void showBalance(double savingsAccountBalance, double currentAccountBalance)
	{
		
		System.out.print("\n\tYOUR ACCOUNT BALANCE\n");
		System.out.print("\nSavings Account Balance : Rs.");
		System.out.print(savingsAccountBalance);
		System.out.print("\n\nCurrent Account Balance : Rs.");
		System.out.print(currentAccountBalance);
		System.out.print("\n\nTotal Account Balance : Rs.");
		System.out.print(savingsAccountBalance + currentAccountBalance);
		System.out.print("\n");
	}
	
	// printAccountTypeMenu method that method ask to user for choose account type
	static void printAccountTypeMenu()
	{
		
		System.out.print("\n\tSELECT ACCOUNT TYPE\n");
		System.out.print("\nPress 's' for savings account\n");
		System.out.print("\nPress 'c' for current account\n");
		System.out.print("\nEnter your chocie here : ");				
	}
	
	// atm method that call inside the main method
	public static void atm() throws ATMException
	{
		Scanner scan = new Scanner(System.in);
		
		double savingsAccountBalance, currentAccountBalance, amount;
		savingsAccountBalance = 5000.0;
		currentAccountBalance = 5000.0;
		int atmPin;
		char cont = 'y';
		char choice, accountType;
		int count = 3;
		
		// Do while loop start 
		do
		{
			try
			{
		
			System.out.print("\tWELCOME TO JAVA ATM\n");
			System.out.print("\nEnter you ATM PIN : ");
			
			atmPin = scan.nextInt();
			scan.nextLine();
			
			// password define here 
			if (atmPin == 1234)
			{
				// printMenu method is calling
				printMenu();
				choice = scan.next().charAt(0);
				
				// After menu method asking user choice 
				switch(choice)
				{
					// in this case showBalance method is calling
					case '1':
						showBalance(savingsAccountBalance, currentAccountBalance);
						break;
					// if user choose for withdrawing cash
					case '2':
						// asking for which account you have to deposit cash saving or current
						printAccountTypeMenu();
						accountType = scan.next().charAt(0);
						
						// nested switch case for asking which type account type user choose
						switch(accountType)
						{
							// withdrawing the amount from saving account	
							case 's':
								System.out.print("\nEnter amount to be withdrawn : ");
								amount = scan.nextDouble();
								scan.nextLine();
								
								// checking the conditon that total amount is greater than withdrawing amount
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
							// withdrawing the amount from current account		
							case 'c':
								System.out.print("\nEnter amount to be withdrawn : ");
								amount = scan.nextDouble();
								scan.nextLine();
								
								// checking the conditon that total amount is greater than withdrawing amount
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
					// if user choose deposit cash
					case '3':
						// asking for which account you have to deposit cash saving or current
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
					// if user press 0 then exit	
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
			// catching the exception according the program
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
			
			// if no of attempts is 0 then program will be close or exit
			if(count == 0)
			{
				System.out.print("\n No of attemts are over.\n");
				System.out.print("\n Now exiting from ATM system.\n");
				System.exit(0);
			}
			System.out.print("\nDo you want to continue (y/n) ? ");
			cont = scan.next().charAt(0);
		}
		// checking conditions that user wants to continue or not
		while(cont == 'y' || cont == 'Y');
	
	}
	
	// main method
	public static void main(String[] args)
	{
		// atm method is calling
		atm();
	}
}

// this ATMException class is handle all the exception of ATM class
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

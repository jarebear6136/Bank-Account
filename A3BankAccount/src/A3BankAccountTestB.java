import java.util.*;
/*
 * A Bank Account Tester Class
 * Written by Jarrett Nobles
 * Due 10/3/2020
 */
public class A3BankAccountTestB {

	public static void main(String[] args) 
	{
		double initialDep=0;
		Scanner in = new Scanner(System.in);
		//prompting for an initial deposit
		System.out.println("Enter an initial monetary deposit: ");
		initialDep=in.nextDouble();
		System.out.println("Your opening balance is: $"+initialDep);
		//construct a Bank Account object
		A3BankAccountB myBA= new A3BankAccountB(initialDep);
		int choice;
		double amount;
		myBA.menu();
		choice=in.nextInt();
		//provide multiple transactions using a while loop
		while(choice>=0 )
		{	
			//statement if the user enters anything greater than 4 in the menu options
			if (choice > 4) 
			{
				System.out.println("Please enter the proper menu selection: ");
				
			}
			
			//if the user wants to deposit money
			else if(choice==1)
			{
				System.out.println("Deposit Money");
				System.out.println("Enter the deposit amount: ");
				amount=in.nextDouble();
				myBA.deposit(amount);
				System.out.println("Money Deposited.");
				System.out.println("Your new balance is: $"+myBA.getBalance());
			}
			
			//add functions for wthdrawal
			else if(choice==2)
			{
				System.out.println("Withdraw Money");
				System.out.println("Enter the amount to withdraw");
				amount=in.nextDouble();
				
				//statement if the user enters an amount greater than their balance
				if(amount > initialDep) 
				{
					System.out.println("Withdrawal amount exceeds bank balance: $"+myBA.getBalance());
					System.out.println("Enter withdrawal amount:");
					amount=in.nextDouble();
					myBA.withdraw(amount);
					System.out.println("Your current balance after withdrawal is: $"+myBA.getBalance());
				}
				else 
				{
					myBA.withdraw(amount);
					System.out.println("Money Withdrew: $"+amount);
					System.out.println("Your current balance after transaction is: $"+myBA.getBalance());
				}
			}
			
			//get the balance statement
			else if (choice==3)
			{
				System.out.println("Get Balance");
				System.out.println("Your current balance is $"+myBA.getBalance());
			}
			
			//The exit function
			else if (choice==4)
			{
				System.out.println("Thank you for your transaction, have a nice day!");
				break;
			}
			
			myBA.menu();
			choice=in.nextInt();
		
		}//while loop ends here
	}

}

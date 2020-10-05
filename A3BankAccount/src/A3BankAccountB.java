import java.util.*;
/*
 * A Java implementation to perform banking operations 
 * deposit,withdraw,getBalance
 * Written by J. Nobles
 * 10/2/2020
 */
public class A3BankAccountB {
	//instance variables
	private static  double balance;
	private int choice;
	Scanner in= new Scanner(System.in);
	
	//constructor #1 set the initial balance to 0
	public A3BankAccountB() 
	{
		balance=0;
	}
	/////////////////////////////////////////////
	//constructor #2 requires an initial deposit upon instantiation 
	public A3BankAccountB(double initBalance) 
	{
		balance=initBalance;
	}
	///////////////////////////////////////////////
	public void deposit(double amt)
	{
		balance+=amt;
	}
	////////////////////////////////////////////////
	public void withdraw(double amt)
	{
		 balance-=amt;
	}
	/////////////////////////////////////////////////
	public double getBalance()
	{
		return balance;
	}
	/////////////////////////////////////////////////
	public void menu()
	{
		System.out.println("Enter banking option");
		System.out.println("1. Deposit: ");
		System.out.println("2. Withdraw: ");
		System.out.println("3. Get Balance: ");
		System.out.println("4. Exit: ");
	}	
}

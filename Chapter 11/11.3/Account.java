/*
 * Davis Odom
 * 9/1/15
 * The base account class for the savings and checking account classes
 */
import java.text.NumberFormat;
import java.util.Calendar;

public class Account {
	private int acctNum;
	private double balance;
	private float interestRate;
	private String dateCreated;
	protected NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	public Account(){
		acctNum = 1;
		balance = 0;
		interestRate = 0;
		dateCreated = "TODAY";
	}
	
	public Account(int num, double bal, float interest, String date){
		acctNum = num;
		balance = bal;
		interestRate = interest;
		dateCreated = date;
	}
	
	//returns the balance
	public double getBalance(){
		return balance;
	}
	
	//adds money to the account
	public void Deposit(double amount){
		balance += amount;
	}
	
	//removes money from the account
	public void Withdraw(double amount){
		balance -= amount;
	}
	
	//describes the account to humans
	public String toString(){
		return "Account "+ acctNum +": balance = " + formatter.format(balance) + " interest rate = " + interestRate +
				" created on " + dateCreated;
	}
}

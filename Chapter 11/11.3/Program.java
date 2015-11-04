/*
 * Davis Odom
 * 9/1/15
 * Tests the various account classes
 */
public class Program {
	public static void main(String[] args){
		Account a1 = new Account();
		SavingsAccount a2 = new SavingsAccount();
		CheckingAccount a3 = new CheckingAccount();
		
		//describe the accounts
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}

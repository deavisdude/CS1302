/*
 * Davis Odom
 * 9/1/15
 * A savings account class
 */
public class SavingsAccount extends Account {
	
	public SavingsAccount(){
		super();
	}
	
	//removes an amount from the account
	@Override
	public void Withdraw(double amount){
		if((getBalance()-amount)<0){
			System.out.println("You cannot overdraft a savings account.  "
					+ "You have " + formatter.format(getBalance()) + " left.");
		}else{
			super.Withdraw(amount);
		}
	}
	
	//describes the account to humans
	@Override
	public String toString(){
		String s = super.toString();
		s = s.concat("\nType: Savings");
		return s;
	}
}

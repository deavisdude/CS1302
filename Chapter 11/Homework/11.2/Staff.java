/*
 * Davis Odom
 * 9/3/15
 * An employee that is a staff member with a title
 */
public class Staff extends Employee{
	private String title;
	
	public Staff(String name, MyDate date){
		super(name, date);
	}
	
	//describes the staff member to humans
	@Override
	public String toString(){
		return "Staff " + getName();
	}
}

/*
 * Davis Odom
 * 9/3/15
 * A person with a job and an office that was hired with a salary
 */
public class Employee extends Person{
	private String office;
	private MyDate dateHired;
	private double salary;
	
	public Employee(String name, MyDate date){
		super(name);
		dateHired = date;
	}
	
	//describes the employee to humans
	@Override
	public String toString(){
		return "Employee " + getName();
	}
}

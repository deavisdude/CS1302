/*
 * Davis Odom
 * 9/3/15
 * A employee who is a faculty member with office hours and a rank
 */
public class Faculty extends Employee{
	private String officeHours, rank;
	
	public Faculty(String name, MyDate date){
		super(name, date);
	}
	
	//describes the faculty member to humans
	@Override
	public String toString(){
		return "Faculty " + getName();
	}
}

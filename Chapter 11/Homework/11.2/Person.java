/*
 * Davis Odom
 * 9/3/15
 * A person with a name, address, phone and email
 */
public class Person {
	private String name, address, phone, email;
	
	public Person(String name){
		this.name = name;
	}
	
	//returns the name
	public String getName(){
		return name;
	}
	
	//describes the person to humans
	@Override
	public String toString(){
		return "Person " + getName();
	}
}

/*
 * Davis Odom
 * 9/3/15
 * A person that is a student that has a class
 */
public class Student extends Person{
	private final String graduatingClass;
	
	public Student(String name, String grad){
		super(name);
		graduatingClass = grad;
	}
	
	//describes the student to humans
	@Override
	public String toString(){
		return "Student " + getName();
	}
}

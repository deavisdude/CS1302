/*
 * Davis Odom
 * 9/3/15
 * Tests all of the classes in this folder
 */
public class Program {
	public static void main(String[] args){
		//define the people
		Person p = new Person("John");
		Student s = new Student("Jacob", "2019");
		Employee e = new Employee("Jinglehiemer", new MyDate());
		Faculty f = new Faculty("Smith", new MyDate(999999999));
		Staff st = new Staff("His name is my name too", new MyDate());
		
		//display results
		System.out.println(p);
		System.out.println(s);
		System.out.println(e);
		System.out.println(f);
		System.out.println(st);
	}
}

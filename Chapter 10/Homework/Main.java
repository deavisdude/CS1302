/*
 * Davis Odom
 * 8/27/15
 * Tests the Student class using the provided data
 */
public class Main {
	public static void main(String[] args){
		Student s1,s2,s3;
		s1 = new Student("Jane", "Doe", 5);
		s2 = new Student("John", "Smith", 5);
		s3 = new Student("David", "Hill", 3);
		
		s1.createCourse("Math", 4, 'A');
		s1.createCourse("English", 3, 'A');
		s1.createCourse("CS", 4, 'A');
		s1.createCourse("Chemistry", 3, 'B');
		s1.createCourse("Health", 2, 'B');
		
		s2.createCourse("Math", 4, 'B');
		s2.createCourse("English", 3, 'B');
		s2.createCourse("CS", 4, 'C');
		s2.createCourse("Chemistry", 3, 'C');
		s2.createCourse("Health", 2, 'B');
		
		s3.createCourse("Math", 4, 'C');
		s3.createCourse("English", 3, 'A');
		s3.createCourse("Health", 2, 'A');
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println();
		for(String s : s1.coursesToString()){
			System.out.println(s);
		}
		System.out.println();
		for(String s : s2.coursesToString()){
			System.out.println(s);
		}
		System.out.println();
		for(String s : s3.coursesToString()){
			System.out.println(s);
		}
		
	}
}

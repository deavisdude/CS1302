/*
 * Davis Odom 
 * 9/8/15
 * Redeifines Listing 10.6's course class with an ArrayList instead of an
 * array holding the students.  This version also has the dropStudent method
 * working
 */

import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents;
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	
	//adds a student to the course
	public void addStudent(String student){
		students.add(student);
		numberOfStudents++;
	}
	
	//returns an array of the students
	public String[] getStudents(){
		return (String[]) students.toArray();
	}
	
	//returns the number of students
	public int getNumberOfStudents(){
		//ideally we would reference students.size() instead
		return numberOfStudents;
	}
	
	//returns the course's name
	public String getCourseName(){
		return courseName;
	}
	
	//removes a student from the course
	public void dropStudent(String student){
		students.remove(student);
	}
}

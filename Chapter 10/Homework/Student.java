/*
 * Davis Odom
 * 8/27/15
 * Stores data about a student including a gpa and all of his courses
 */
import codelibraries.chp10.Course;

public class Student {
	private String _fname ,_lname;
	private Course[] _cArry;
	private int _numCourses = 0;
	
	public Student(String firstname, String lastname, int numCourses){
		_fname = firstname;
		_lname = lastname;
		_cArry = new Course[numCourses];
	}
	
	public void createCourse(String courseName, int creditHours, char letterGrade){
		Course c = new Course(courseName, creditHours, letterGrade);
		_cArry[_numCourses] = c;
		_numCourses++;
	}
	
	public String[] coursesToString(){
		String[] strings = new String[_numCourses];
		for(int i=0; i<_numCourses; i++){
			strings[i] = "Course Name: " + _cArry[i].getCourseName() + ", Credit Hours: "+
					_cArry[i].getCreditHours() + ", Letter Grade: " + _cArry[i].getLetterGrade();
		}
		return strings;
	}
	
	public String toString(){
		return "Student " + _fname + " " + _lname + " has a " + Course.computeGPA(_cArry) + "GPA";
	}
}

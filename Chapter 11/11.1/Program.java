/*
 * Davis Odom
 * 9/1/15
 * Tests the Triangle class
 */
import java.util.Scanner;

public class Program {
	public static void main(String[] args){
		Triangle triangle;
		double d1, d2, d3;

		Scanner s = new Scanner(System.in);
		
		//get the sides
		System.out.println("Please enter the first side");
		d1 = s.nextDouble();
		System.out.println("Please enter the second side");
		d2 = s.nextDouble();
		System.out.println("Please enter the third side");
		d3 = s.nextDouble();
		
		//make the triangle
		triangle = new Triangle(new double[]{d1,d2,d3});
		
		//get triangle info
		System.out.println("What color is the triangle?");
		triangle.setColor(s.next());
		System.out.println("Is the triangle filled? (true or false)");
		triangle.setFilled(s.nextBoolean());
		
		//describe the triangle
		System.out.println("Area: " + triangle.getArea() + " Perimeter: " + triangle.getPerimeter() + 
				" Color: " + triangle.getColor() + " Filled: " + triangle.isFilled());
	}
}

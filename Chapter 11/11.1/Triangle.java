/*
 * Davis Odom
 * 9/1/15
 * A triangle that can tell you its area and perimeter
 */
public class Triangle extends GeometricObject{
	
	private double side1 = 1, side2 = 1, side3 = 1;
	
	public Triangle(){
		
	}
	
	public Triangle(double[] sides){
		super();
		side1 = sides[0];
		side2 = sides[1];
		side3 = sides[2];
	}
	
	//gets a specified side
	public double getSide(int sideNum){
		switch(sideNum){
		case 1:
			return side1;
		case 2:
			return side2;
		case 3:
			return side3;
		}
		
		System.out.println("Invalid side number!");
		return 0.0;
	}
	
	//gets the area of the triangle
	public double getArea(){
		double s = getPerimeter()/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	//gets the perimeter of the triangle
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	//defines the triangle for a human
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}

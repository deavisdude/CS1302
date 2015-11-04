/*
 * Davis Odom
 * 9/1/15
 * Bare Minimum geometric object to meet the needs of the Triangle class
 */
public class GeometricObject {
	private boolean filled;
	private String color;
	
	public GeometricObject(){
		filled = false;
		color = "black";
	}
	
	//Returns weather or not the object is to be filled
	public boolean isFilled(){
		return filled;
	}
	
	//returns the color
	public String getColor(){
		return color;
	}
	
	//changes weather or not the object is filled
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	//sets the color
	public void setColor(String color){
		this.color = color;
	}
}

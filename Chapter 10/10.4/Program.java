/*
 * Davis Odom
 * 8/25/15
 * Tests the MyPoint class
 */
public class Program {
	public static void main(String[]args){
		MyPoint regular,custom;
		regular = new MyPoint();
		custom = new MyPoint(10f,30.5f);
		
		System.out.println("The distance between "+regular.toString()+" and "+
		custom.toString()+": "+regular.distance(custom));
	}
}

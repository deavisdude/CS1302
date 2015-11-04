/*
 * Davis Odom
 * 8/20/15
 * Uses the Time class to set and display times
 */
public class Program {
	public static void main(String[] args){
		//Make the objects
		Time realTime = new Time();
		Time testTime = new Time(555550000);
		
		//Display the objects in the console
		System.out.println("The real time:\t"+realTime.toString());
		System.out.println("The test time:\t"+testTime.toString());
	}
}

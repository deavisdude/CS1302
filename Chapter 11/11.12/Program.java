/*
 * Davis Odom
 * 9/3/15
 * Tests a method that sums all numbers in an arraylist
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	public static void main(String[] args){
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner in = new Scanner(System.in);
		
		//get the numbers
		System.out.println("Please enter 5 numbers one at a time.");
		for(int i=0; i<5; i++){
			list.add(in.nextDouble());
		}
		
		//display the sum
		System.out.println("The sum of these numbers is: " + sum(list));
	}
	
	//sums all the given doubles
	public static double sum(ArrayList<Double> list){
		double sum = 0;
		for(double i : list){
			sum += i;
		}
		return sum;
	}
}

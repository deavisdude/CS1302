/*
 * Davis Odom
 * 10/20/15
 * Recursively sums the digits or a given long
 */
import java.util.Scanner;

public class Program {
	public static void main(String[] args){
		//get the number and call the method in a print statement
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a long to be summed: ");
		System.out.print(sumDigits(in.nextLong()));
	}
	
	//sums the digits of a given long recursively
	public static int sumDigits(long n){
		//turn it into a string
		String str = ""+n;
		//if the string is longer than one char
		if(str.length() > 1){
			//add the first digit to the rest recursively
			return Integer.parseInt(""+str.charAt(0)) +  sumDigits(Long.parseLong(str.substring(1))); 
		}else{
			//otherwise return the last digit
			return (int) Long.parseLong(str);
		}
	}
}

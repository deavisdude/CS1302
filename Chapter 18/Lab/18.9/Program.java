/*
 * Davis Odom
 * 10/13/15
 * Tests a method which displays a in reverse
 */
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		//get the string
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a String: ");
		//call the method
		reverseDisplay(in.next());
	}
	
	public static void reverseDisplay(String value){
		//if our string is not only one character...
		if(value.length()>1){
			//..print out the last char and call again with a substring excluding the final char
			System.out.print(value.charAt(value.length()-1));
			reverseDisplay(value.substring(0, value.length()-1));
		}else{
			//if it's the final char just print it and drop out of the process
			System.out.print(value);
		}
	}

}

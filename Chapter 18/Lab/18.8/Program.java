/*
 * Davis Odom
 * 10/13/15
 * Tests a method which displays an integer in reverse
 */
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		//get the integer
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		//call the method
		reverseDisplay(in.nextInt());
	}
	
	public static void reverseDisplay(int value){
		//convert to a string
		String intString = new Integer(value).toString();
		//if our string is not only one character...
		if(intString.length()>1){
			//..print out the last char and call again with a substring excluding the final char
			System.out.print(intString.charAt(intString.length()-1));
			reverseDisplay(new Integer(intString.substring(0, intString.length()-1)));
		}else{
			//if it's the final char just print it and drop out of the process
			System.out.print(intString);
		}
	}

}

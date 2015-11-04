/*
 * Davis Odom
 * 8/22/15
 * Tests all of the methods for the MyInteger class
 */
import java.util.Scanner;

public class Program {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Define your Integer");
		MyInteger myInt = new MyInteger(MyInteger.parseInt(scanner.next()));
		
		System.out.println("Value: "+myInt.value
				+"Even: "+myInt.isEven()
				+"\tOdd: "+myInt.isOdd()
				+"\tPrime: "+myInt.isPrime());
		System.out.print("Check if your int is equal to: ");
		char[] chars = scanner.next().toCharArray();
		
		System.out.println("Check from chars: "+myInt.equals(MyInteger.parseInt(chars)));
		System.out.println("Check from string: "
		+myInt.equals(new MyInteger(MyInteger.parseInt(new String(chars)))));
	}
}

/*
 * Davis Odom
 * 10/13/15
 * Tests a factorial method
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		//our bigInt and scanner
		BigInteger bigInt;
		Scanner in = new Scanner(System.in);
		
		//get the number
		System.out.print("Please enter a number: ");
		bigInt = new BigInteger(in.next());
		//print out its factorial
		System.out.print(factorial(bigInt));
	}

	//returns the factorial for a bigInteger
	static BigInteger factorial(BigInteger n){
		//if the number is less than or equal to 1, it is one
		if(n.compareTo(BigInteger.ONE) <=0){
			return BigInteger.ONE;
		}else{
			//use recursion to find the factorial
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
}

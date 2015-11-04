/*
 * Davis Odom
 * 9/8/15
 * Takes in 5 strings and spits them out backwards
 * this class uses the MyStack class
 */
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		MyStack strings = new MyStack();
		Scanner in = new Scanner(System.in);
		
		//Collect Data
		for(int i=0; i<5; i++){
			System.out.println("Please enter a String");
			strings.add(in.next());
		}
		
		//Spit it out backwards
		for(int i=strings.size()-1; i>=0; i--){
			System.out.println(strings.get(i));
		}
	}

}

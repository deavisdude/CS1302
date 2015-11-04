import java.util.Scanner;

/*
 * Davis Odom
 * 10/20/15
 * Displays all permutations of a string using recursion
 */
public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		//call the friendly method
		displayPermutation(in.next());
	}

	//calls the real method
	public static void displayPermutation(String s){
		displayPermutation(" ", s);
	}
	
	public static void displayPermutation(String s1, String s2){
		//if the second string is empty, print the first
		if(s2.length() == 0){
			System.out.println(s1);
		}else{
			//generate out permutations recursively
			for(int i =0; i< s2.length(); i++){
				displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i+1, s2.length()));
			}
		}
	}
}

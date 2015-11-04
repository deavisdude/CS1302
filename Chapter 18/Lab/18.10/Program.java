/*
 * Davis Odom
 * 10/20/15
 * Gets a word and a char and counts the char's occurrences in the string
 */
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//the word and char vars
		String word;
		char c;
		Scanner in = new Scanner(System.in);
		
		//prompt and get data
		System.out.print("Please enter the word to check: ");
		word = in.next();
		System.out.print("Please enter the character to count: ");
		c = in.next().charAt(0);
		
		//print results
		System.out.println(count(word, c));
	}
	
	//Recursively counts occurrences 
	public static int count(String str, char a){
		//if there is no more occurrences, return 0
		if(str.indexOf(a) == -1){
			return 0;
			//if we can keep going, do so
		}else if(str.indexOf(a) != str.lastIndexOf(a)){
			return 1 + count(str.substring(str.indexOf(a)+1), a);
		}else{
			return 1;
		}
	}

}

/*
 * Davis Odom
 * 10/22/15
 * Counts the number of files in a directory
 */
import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args){
		//Get the directory
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a directory: ");
		File root = new File(in.next());
		//Get the files under the root
		File[] children = root.listFiles();
		//count the files
		int count =0;
		for(File f : children){
			//only counts if it is a true file (no directories)
			if(f.isFile())
				count++;
		}
		//print the results
		System.out.println(count + " files.");
	}
}

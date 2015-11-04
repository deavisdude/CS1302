/*
 * Davis Odom
 * 10/20/15
 * Recursively searches a directory for the total number of lines with the given word
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) throws FileNotFoundException {
		//get the path and key
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the file path: ");
		File base = new File(in.next());
		System.out.print("Please enter the keyword: ");
		//call the method
		System.out.println(countLinesWithString(base, in.next()));
	}

	//does the searching
	public static int countLinesWithString(File root, String key) 
            throws FileNotFoundException{
		//if it is a directory, add up the results of calling this method on all files
		if(root.isDirectory()){
			File[] files = root.listFiles();
			int count=0;
			for(File f : files){
				count += countLinesWithString(f, key);
			}
			return count;
		}
		
		//if it is a file, scan for the number of lines with the word
		if(root.isFile()){
			Scanner in = new Scanner(root);
			int count = 0;
			while(in.hasNextLine()){
				String line = in.nextLine();
				if(line.indexOf(key) != -1)
					count++;
			}
			return count;
		}
		return -1;
	}
}

/*
 * Davis Odom
 * 9/3/15
 * Tests the union method which attaches one arraylist to the end of another
 * union method is like String.concat() for int arraylists
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	public static void main(String[] args){
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		
		//****collect ints****
		System.out.println("Enter five integers for list1:");
		for(int i=0; i<5; i++){
			list1.add(in.nextInt());
		}
		
		System.out.println("Enter five integers for list2:");
		for(int i=0; i<5; i++){
			list2.add(in.nextInt());
		}
		//********
		
		//make one final list
		ArrayList<Integer> finalList = union(list1, list2);
		
		//display results
		System.out.print("The combined list is");
		for(int i=0; i<10; i++){
			System.out.print(" " + finalList.get(i));
		}
	}
	
	//combines two arraylists of ints
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2){
		for(int i : list2){
			list1.add(i);
		}
		return list1;
	}
}

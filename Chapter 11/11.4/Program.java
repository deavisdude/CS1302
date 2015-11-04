/*
 * Davis Odom
 * 9/1/15
 * Takes a user-generated arraylist and spits out the highest value
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a series of integers ending in 0");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//collects the ints
		boolean go = true;
		while(go){
			int i = in.nextInt();
			if(i == 0){
				go = false;
			}
			list.add(i);
		}
		//display the largest number
		System.out.println("The largest number was "+max(list));
	}
	
	//finds the largest integer in an arraylist
	public static Integer max(ArrayList<Integer> list){
		if(list == null || list.size() == 0){
			//this will never be run due to the way I've structured the list-generation
			return null;
		}
		
		int max = list.get(0);
		for(Integer i : list){
			if(i > max){
				max = i;
			}
		}
		return max;
	}
}

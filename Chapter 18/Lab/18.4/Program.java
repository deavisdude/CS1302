/*
 * Davis Odom
 * 10/13/15
 * Calculates the series from 18.4 using recursion
 */
public class Program {
	public static void main(String[] args) {
		//print the function's results for 1-10
		for(int i=1; i<=10; i++){
			System.out.println(i + ": " +  calculate(i));
		}
	}
	
	//calculate the series
	public static float calculate(float i){
		if(i == 1){
			return 1;
		}else{
			return 1/i + calculate(i-1);
		}
	}

}

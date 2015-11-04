/*
 * Davis Odom
 * 8/22/15
 * A custom integer class which tells you various information about an integer
 */
public class MyInteger {
	private int value;
	
	public MyInteger(int i){
		value = i;
	}
	
	public int getValue(){
		return value;
	}
	
	//****STATIC METHODS****
	public static boolean isEven(MyInteger myInt){
		if(myInt.value % 2 == 0)
			return true;
		else return false;
	}
	
	public static boolean isOdd(MyInteger myInt){
		return !MyInteger.isEven(myInt);
	}
	
	public static boolean isPrime(MyInteger myInt){
		if(myInt.value == 2)
		      return true;
		
		for(int i=2; i<=(int)Math.sqrt(myInt.value)+1; i++){
			if(myInt.value % i == 0)
		        return false;
		    }
		return true; 
	}
	
	public static int parseInt(char[] chars){
		return Integer.parseInt(new String(chars));
	}
	
	public static int parseInt(String str){
		return Integer.parseInt(str);
	}
	//********
	
	//Is my int even?
	public boolean isEven(){
		return MyInteger.isEven(this);
	}
	
	//Is my int odd?
	public boolean isOdd(){
		return MyInteger.isOdd(this);
	}
	
	//Is my int prime?
	public boolean isPrime(){
		return MyInteger.isPrime(this);
	}
	
	public boolean equals(int i){
		if(value == i)
			return true;
		else return false;
	}
	public boolean equals(MyInteger myInt){
		if(myInt.value == value)
			return true;
		else return false;
	}
}

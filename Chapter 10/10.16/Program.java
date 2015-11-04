import java.math.BigInteger;

/*
 * Davis Odom
 * 8/25/15
 * Finds the first ten numbers with 50 digits that are
 * divisible by either 2 or 3
 */
public class Program {
	public static void main(String[] args){
		BigInteger num = new BigInteger("10000000000000000000000000000000000000000000000000"); 
		int count=0;
		BigInteger[] answers = new BigInteger[10];
		while(count<10){
			if(num.remainder(new BigInteger("2")).equals(new BigInteger("0"))  || num.remainder(new BigInteger("3")).equals(new BigInteger("0"))){
				answers[count] = num;
				count++;
				System.out.println(num);
			}
			num = num.add(new BigInteger("1"));
		}
		
	}
}

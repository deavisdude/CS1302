/*
 * Davis Odom
 * 8/26/15
 * Removes the junk from a string, parses it into two ints and an operator,
 * does the math and then spits out the result
 */
public class Calculator {
  public static void main(String[] args) {
	  
	  //The String
	  String string = "";
	  int num1=0,num2=0;
	  char operator = '+';
	  for(String s : args){
		  string = string.concat(s);
	  }
	  
	  //Remove the junk
	  string.replaceAll("\\s","");
	  
    // The result of the operation
    int result = 0;
    
    // Determine the operator and do the math
    if(string.contains("+")){
    	operator = '+';
    	num1 = Integer.parseInt(string.substring(0, string.indexOf('+')));
    	num2 = Integer.parseInt(string.substring(string.indexOf('+')+1));
    	result = num1 + num2;
    }
    if(string.contains("-")){
    	operator = '-';
    	num1 = Integer.parseInt(string.substring(0, string.indexOf('-')));
    	num2 = Integer.parseInt(string.substring(string.indexOf('-')+1));
    	result = num1 - num2;
    }
    if(string.contains("*")){
    	operator = '*';
    	num1 = Integer.parseInt(string.substring(0, string.indexOf('*')));
    	num2 = Integer.parseInt(string.substring(string.indexOf('*')+1));
    	result = num1 * num2;
    }
    if(string.contains("/")){
    	operator = '/';
    	num1 = Integer.parseInt(string.substring(0, string.indexOf('/')));
    	num2 = Integer.parseInt(string.substring(string.indexOf('/')+1));
    	result = num1 / num2;
    }

    // Display result    
    System.out.println(num1 + " " + operator + " " + num2
      + " = " + result);
  }
}
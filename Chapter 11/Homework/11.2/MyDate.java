/*
 * Davis Odom
 * 9/3/15
 * A class that mimics the Calendar class but with less functionality
 */

import java.util.Calendar;

public class MyDate {
	private Calendar cal;
	private Calendar.Builder builder = new Calendar.Builder();
	private int year, month, day;
	
	public MyDate(){
		cal = Calendar.getInstance();
		
		year = cal.YEAR;
		month = cal.MONTH;
		day = cal.DAY_OF_MONTH;
	}
	
	public MyDate(long elapsedMilis){
		builder = builder.setInstant(elapsedMilis);
		cal = builder.build();
		
		year = cal.YEAR;
		month = cal.MONTH;
		day = cal.DAY_OF_MONTH;
	}
	
	public MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//returns the year
	public int getYear(){
		return year;
	}
	
	//returns the month
	public int getMonth(){
		return month;
	}
	
	//returns the day
	public int getDay(){
		return day;
	}
	
	//sets the date using miliseconds
	public void setDate(long elapsedTime){
		builder.setInstant(elapsedTime);
		cal = builder.build();
		
		year = cal.YEAR;
		month = cal.MONTH;
		day = cal.DAY_OF_MONTH;
	}
}

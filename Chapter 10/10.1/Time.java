/*
 * Davis Odom
 * 8/20/15
 * Exercise 10.1
 * Stores time in hours, minutes, and seconds
 * can be set using system time, ms, or hr/min/sec
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
	private int hour,minute,second;
	
	//Sets this object to the current system time
	public Time(){
		setTime(System.currentTimeMillis());
	}
	
	//Specifies the time in miliseconds
	public Time(long miliseconds){
		setTime(miliseconds);
	}
	
	//Specifies time in hours
	public Time(int hr, int min, int sec){
		hour = hr;
		minute = min;
		second = sec;
	}
	
	//****GETTERS****
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	//********
	
	//Uses a gregorian calendar object to convert milis to human-readable time
	public void setTime(long elapseTime){
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(elapseTime);
		
		hour = gc.get(Calendar.HOUR);
		minute = gc.get(Calendar.MINUTE);
		second = gc.get(Calendar.SECOND);
	}
	
	//Returns a readable string
	public String toString(){
		return "Hour: "+hour+"\tMinute: "+minute+"\tSecond: "+second;
	}
}

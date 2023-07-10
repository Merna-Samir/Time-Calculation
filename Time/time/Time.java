package time;

import java.util.Scanner;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;
	
	
	public Time () {
		hours   = 0;
		minutes = 0; 
		seconds = 0;
	}
	
	public Time (int hours , int minutes , int seconds) {
		this.hours   = hours;
		this.seconds = seconds;
		this.minutes = minutes; 
		
	}
	
	public void sethours(int hours) {	
	this.hours  = hours ;
	}
	
	public void setminutes(int minutes) {
	this.minutes = minutes; 
	}
	
	public void setseconds(int seconds) {
	this.seconds = seconds;
	}
	public int gethours() {	
	return hours  ;
	}
	
	public int getminutes() {
	return minutes ; 
	}
	
	public  int getseconds() {
		return seconds ;
	}

	    
	
	public void AddTime( Time t1 , Time t2) {
		
		int AddHours = t1.gethours()+t2.gethours();
		if(AddHours > 12 ) {
			AddHours = AddHours - 12 ;
			
		}
		
		int AddMin =t1.getminutes()+t2.getminutes();
		if( AddMin > 59 ) {
		AddMin = AddMin -60;
		AddHours++ ;
		}
		
		int AddSeconds = t1.getseconds()+t2.getseconds();
		if(AddSeconds >59) {
			AddSeconds = AddSeconds-60;
					AddMin++;
		}
		System.out.println ("Third time = " + AddHours + ":" + AddMin + ":" +AddSeconds);
		
	}

}

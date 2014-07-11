import java.util.Calendar;
import java.util.TimeZone;

public class Time {
	int day;
	int month;
	int year;
	int seconds;
	int minutes;
	int hours;
	
	Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
	
	public Time(){
		super();
	}
	
	public Time(int day, int month, int year, int seconds, int minutes, int hours){
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
	}
	
	public void setDay(int day){
		this.day = localCalendar.get(Calendar.DATE);
	}
	
	public void setMonth(int month){
		this.month = localCalendar.get(Calendar.MONTH);
	}
	
	public void setYear(int year){
		this.year = localCalendar.get(Calendar.YEAR);
	}
	
	public void setSeconds(int seconds){
		this.seconds = localCalendar.get(Calendar.SECOND);
	}
	
	public void setMinutes(int minutes){
		this.minutes = localCalendar.get(Calendar.MINUTE);
	}
	
	public void setHours(int hours){
		this.hours = localCalendar.get(Calendar.HOUR_OF_DAY);
	}
	
	public int getDay(){
		return this.day;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getSeconds(){
		return this.seconds;
	}
	
	public int getMinutes(){
		return this.minutes;
	}
	
	public int getHours(){
		return this.hours;
	}
	
	public String toString() {
        String date = String.format("%d:%d:%d %d.%d.%d", hours, minutes, seconds, day, month, year);
        return date;
    }
	
	
}
	


public class Clock {
	protected int hour;
	protected int minutes;
	protected String timeOfDay;
	
	public Clock(int hour, int minutes, String timeOfDay) {
		this.hour = hour;
		this.minutes = minutes;
		this.timeOfDay = timeOfDay;
	}
	
	public Clock(Clock c) {
		this.hour = c.hour;
		this.minutes = c.minutes;
		this.timeOfDay = c.timeOfDay;
	}
	
	public Clock(int hour, int minutes) {
		this.hour = hour;
		this.minutes = minutes;
	}
	
	public String getTimeOfDay() {
		return timeOfDay;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minutes;
	}
	
	public String getClock() {
		return hour + ":" + minutes + " " + timeOfDay;
	}
	
	public String timeToString() {
		Integer.toString(hour);
		return " ";
	}
}

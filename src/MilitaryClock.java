
public class MilitaryClock extends Clock {

	public MilitaryClock(int hour, int minutes, String TimeOfDay) {
		super(hour, minutes, TimeOfDay);

	}
	
	public String convertedClock() {
		int tempHour = hour;
		if (timeOfDay.equals("AM")) {
			return Integer.toString(hour) + Integer.toString(minutes);
		} else {
			tempHour += 12;
			return Integer.toString(tempHour) + Integer.toString(minutes);
		}
	}

}

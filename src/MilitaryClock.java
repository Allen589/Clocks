
public class MilitaryClock extends Clock {

	public MilitaryClock(int hour, int minutes, String TimeOfDay) {
		super(hour, minutes, TimeOfDay);

	}
	
	public MilitaryClock(int hour, int minutes) {
		super(hour, minutes);
	}

	public String convertedClock() {
		int tempHour = hour;
		String midnight = "0000";
		String convertedHour;
		String convertedMinute;
		if (hour == 12 && minutes == 00 && timeOfDay.equals("AM")) {
			return midnight;
		}
		if (timeOfDay.equals("AM")) {
			if (hour < 10) {
				convertedHour = "0" + Integer.toString(hour);
			} else {
				convertedHour = Integer.toString(hour);
			}

			if (minutes < 10) {
				convertedMinute = "0" + Integer.toString(minutes);
			} else {
				convertedMinute = Integer.toString(minutes);
			}

			return convertedHour + convertedMinute;

		} else {
			tempHour += 12;
			if (minutes < 10) {
				convertedMinute = "0" + Integer.toString(minutes);
			} else {
				convertedMinute = Integer.toString(minutes);
			}

			return Integer.toString(tempHour) + convertedMinute;
		}
	}

	public String revertClock() {
		int tempHour = hour;
		String convertedMinute;
		String timeOfDay;

		if (tempHour > 12) {
			tempHour -= 12;
			timeOfDay = "PM";
			if (minutes < 10) {
				convertedMinute = "0" + Integer.toString(minutes);
			} else {
				convertedMinute = Integer.toString(minutes);
			}

			return Integer.toString(tempHour) + ":" + convertedMinute + timeOfDay;
		} else {
			timeOfDay = "AM";
			if (minutes < 10) {
				convertedMinute = "0" + Integer.toString(minutes);
			} else {
				convertedMinute = Integer.toString(minutes);
			}

			return Integer.toString(tempHour) + ":" + convertedMinute + " " + timeOfDay;
		}

	}

}

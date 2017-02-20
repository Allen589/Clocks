
public class driver {

	public static void main(String[] args) {
		Clock c = new Clock(12, 30, "AM");
		String s = c.getClock();
		System.out.println(s);
		
		MilitaryClock m = new MilitaryClock(12, 45, "AM");
		System.out.println(m.convertedClock());
		
	}

}

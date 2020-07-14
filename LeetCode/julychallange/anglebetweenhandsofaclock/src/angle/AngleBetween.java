package angle;

public class AngleBetween {
	
	
    public double angleClock(int hour, int minutes) {
        double _hour = 360.0 * (hour + minutes / 60.0) / 12;
        double _minutes = 360.0 * minutes / 60;
        
        double angle = Math.abs(_hour - _minutes);
        return angle > 180 ? 360 - angle : angle;
    }
	
	
	
	public double angleClockII(int hour, int minutes) {
		double _hour = (hour % 12 * 30) + ((double) minutes / 60 * 30);
		double _minutes = minutes * 6;
		double angle = Math.abs(_minutes - _hour);

		return Math.min(angle, 360.0 - angle);

	}
}

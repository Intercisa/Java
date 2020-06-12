package farctories;

public class Point {

	private double x, y;

	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static class Factory {

		public static Point newCartesianPoint(double x, double y) {
			return new Point(x, y);
		}

		public static Point newPolarPoint(double rho, double theta) {
			return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
		}
	}

	@Override
	public String toString() {
		return String.format("Point [x=%s, y=%s]", x, y);
	}

}

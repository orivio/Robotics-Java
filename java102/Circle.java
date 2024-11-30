public class Circle implements Shape{
	public final Point center;
	public final double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	/** 
	* @return Whether point p is inside of the circle.
	*/
	public boolean isInside(Point p) {
		return Point.distance(center, p) < radius;
	}

	/** 
	* @return Whether point p part of/on the border of the circle.
	*/
	public boolean isOn(Point p) {
		return Point.distance(center, p) == radius;
	}

	/** 
	* @param x How much to translate the circle by in the + x direction.
	* @param y How much to translate the circle by in the + y direction.
	* @return The circle that results from the translation.
	*/
	public Circle translate(double x, double y) {
		return new Circle(center.translateX(x).translateY(y), radius);
	}

	/** 
	* @return The circle that results from scaling by k.
	*/
	public Circle scale(double k) {
		return new Circle(center, radius * k);
	}

	@Override
	public String toString() {
		return "(center: " + center + "; radius: " + radius + ")";
	}

	//practicing

	public static Circle fromPoints(Point p1, Point p2, Point p3) {
		// Handle vertical line cases explicitly
		if (p1.x == p2.x && p2.x == p3.x) {
			throw new IllegalArgumentException("Points are collinear or all on a vertical line!");
		}
	
		// Midpoints of two sides
		Point mid12 = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
		Point mid23 = new Point((p2.x + p3.x) / 2, (p2.y + p3.y) / 2);
	
		// Slopes of the lines
		double slope12 = (p2.x - p1.x) == 0 ? Double.POSITIVE_INFINITY : (p2.y - p1.y) / (p2.x - p1.x);
		double slope23 = (p3.x - p2.x) == 0 ? Double.POSITIVE_INFINITY : (p3.y - p2.y) / (p3.x - p2.x);
	
		// Perpendicular slopes
		double perpSlope12 = (slope12 == Double.POSITIVE_INFINITY) ? 0 : -1 / slope12;
		double perpSlope23 = (slope23 == Double.POSITIVE_INFINITY) ? 0 : -1 / slope23;
	
		// y-intercepts of the perpendicular bisectors
		double c1 = mid12.y - perpSlope12 * mid12.x;
		double c2 = mid23.y - perpSlope23 * mid23.x;
	
		// Solve for the center (intersection of two perpendicular bisectors)
		double centerX, centerY;
		if (perpSlope12 == perpSlope23) {
			throw new IllegalArgumentException("Points are collinear, cannot form a circle.");
		} else if (perpSlope12 == Double.POSITIVE_INFINITY) {
			centerX = mid12.x;
			centerY = perpSlope23 * centerX + c2;
		} else if (perpSlope23 == Double.POSITIVE_INFINITY) {
			centerX = mid23.x;
			centerY = perpSlope12 * centerX + c1;
		} else {
			centerX = (c2 - c1) / (perpSlope12 - perpSlope23);
			centerY = perpSlope12 * centerX + c1;
		}
	
		// Calculate radius as the distance from the center to any of the three points
		Point center = new Point(centerX, centerY);
		double radius = Point.distance(center, p1);
	
		return new Circle(center, radius);
	}
	
	

}

//practicing objects, fields, and classes
public class Point {
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translateX(double t) {
        return new Point(x + t, y);
    }
    public Point translateY(double t) {
        return new Point(x, y + t);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    public static Point centerOfMass(Point[] points) {
        
        double sumX = 0;
        double sumY = 0;

        for (Point point : points) {
            sumX += point.x;
            sumY += point.y;
        }
        double centerX = sumX / points.length;
        double centerY = sumY / points.length;

        return new Point(centerX, centerY);
    }
    
}

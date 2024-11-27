
public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 3);
        System.out.println("x: " + point.x + ", y: " + point.y);
    

        Point xTranslation = point.translateX(3);
        Point yTranslation = point.translateY(-7);
        Point xyTranslation = point.translateX(-4).translateY(-3);

        System.out.println("x transl: (" + xTranslation.x + ", " + xTranslation.y +")");
        System.out.println("y transl: (" + yTranslation.x + ", " + yTranslation.y + ")");
        System.out.println("xy transl: (" + xyTranslation.x + ", " + xyTranslation.y + ")");

        System.out.println("point: " + point);

        //simplification of previous x/y/xy translations
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);



        Point a = new Point(8, 4);
        Point b = new Point(6, 2);
        System.out.println(Point.distance(a, b));
        //worked

        Point[] points = {
            new Point (6, 3),
            new Point (4, 12),
            new Point (5, 4)
        };
        Point center = Point.centerOfMass(points);
        System.out.println(center);
        //worked
    }
}

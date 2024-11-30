
import java.util.ArrayList;
import java.util.Arrays;
public class Main{

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

        // simplification of previous x/y/xy translations
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);

        Point a = new Point(8, 4);
        Point b = new Point(6, 2);
        System.out.println(Point.distance(a, b));

        // worked

        Point[] points = {
            new Point (6, 3),
            new Point (4, 12),
            new Point (5, 4)
        };
        Point center = Point.centerOfMass(points);
        System.out.println(center);

        // worked

        Point c = new Point (1, 1);
        System.out.println(c.angle());

        // worked

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        System.out.println(arr);
        arr.set(0, "Goodbye");
        System.out.println(arr);
        ArrayList<Boolean> conditions = new ArrayList<>();
        conditions.add(true);
        conditions.add(arr.get(0) == "Hello");
        conditions.add(conditions.get(0) || conditions.get(1));
        System.out.println(conditions);
        // worked

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            intArr.add(0);
        }
        System.out.println(intArr.size());
        System.out.println(intArr.get(32));
        // worked

        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 8);
        System.out.println(grid);
        // worked

        String end = arrayToString(array);
        System.out.println(end);
        // worked

        Grid<Integer> intGrid = new Grid<>(3, 3);
        intGrid.set(0, 0, 1);
        intGrid.set(0, 1, 2);
        intGrid.set(0, 2, 3);
        intGrid.set(1, 0, 4);
        intGrid.set(1, 1, 5);
        intGrid.set(1, 2, 6);
        intGrid.set(2, 0, 7);
        intGrid.set(2, 1, 8);
        intGrid.set(2, 2, 9);

        ArrayList<Integer> diagonal = intGrid.diagonal();
        System.out.println("Diagonal: " + diagonal);

        ArrayList<Integer> diagonal2 = grid.diagonal();
        System.out.println("Diagonal 2: " + diagonal2);
        // worked

        Grid<Integer> grid1 = new Grid<>(3, 4);
        Grid<Integer> grid2 = new Grid<>(5, 6);
        Grid<Integer> grid3 = new Grid<>(7, 8);
        System.out.println("Max Side Length: " + Grid.maxSideLength);
        // worked

        Point mid = new Point(0, 0);
        double radius = 5.0;
        Circle circle = new Circle(mid, radius);
        System.out.println("Circle 1: " + circle);

        Circle scaledCircle = circle.scale(6.5);
        System.out.println("Scaled Circle: " + scaledCircle);

        System.out.println("Area of Original Circle: " + circle.area());

        Point corner = new Point (0, 0);
        double sideLength = 3.0;
        Square square = new Square (corner, sideLength);
        System.out.println("Square 1: " + square);

        Square scaledSquare = square.scale(4);
        System.out.println("Scaled Square: " + scaledSquare);

        System.out.println("Area of Square 1: " + square.area());
        // circle and square both worked!!!

        Shape[] shapes = {new Circle(new Point(1.8, -20), 2),
                          new Square(new Point(100, 2.1), 5.4),
                          new Circle(new Point(0, 0), 1),
                          new Circle(new Point(4, 9.123), 98.32),
                          new Square(new Point(-321, 0), 0.02)};
        System.out.println(sumArea(shapes));

        // worked

        double k = 4;
        Shape[] scaledShapes = scaleAll(shapes, k);
        System.out.println(Arrays.toString(scaledShapes));

        

        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 2);
        Point p3 = new Point(2, 0);

        Circle threePointsCircle = Circle.fromPoints(p1, p2, p3);
        System.out.println(threePointsCircle);
        //worked

        RightTriangle triangle = new RightTriangle(5, 5, 0, 0);

        Point pointInside = new Point(2, 2);
        Point pointOutside = new Point (6, 6);
        System.out.println("Point " + pointInside + " inside triangle? " + triangle.isInside(pointInside));
        System.out.println("Point " + pointOutside + " inside triangle? " + triangle.isInside(pointOutside));

        RightTriangle anotherTriangle = new RightTriangle(10, 10, 0, 0);
        System.out.println("Are these triangles similar? " + RightTriangle.similar(triangle, anotherTriangle));
        //works

        A a1 = new A(12.3, 430);
        B b1 = new B(-12.31, "hello");
        a1.method1();
        b1.method1();
        b1.method2();

        A bInDisguise = new B(1002.013, "world");
        bInDisguise.method2();

        LibraryItem[] items = new LibraryItem[] {
            new Book("CoolBook", "A001", "CoolAuthor", 69),
            new DVD("OldMovie", "100A", 457)
        };

        items[0].checkOut();

        System.out.println("Items after checkout:");
        for (LibraryItem item : items) {
            System.out.println(item + " - Available: " + item.available());
        }

        returnAll(items);
        System.out.println("\nItems after returnAll:");
        for (LibraryItem item : items) {
            System.out.println(item + " - Available: " + item.available());
        }
        //worked

        System.out.println(availableItems(items));
        //worked


    }

    static Integer[] array = {1, 2, 5, 6};

    static <T> String arrayToString(T[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        return str + arr[arr.length - 1] + "]";
    }

    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
    }

    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }

    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableItems = new ArrayList<>();

        for (LibraryItem item : items){ 
            if (item.available()) {
                availableItems.add(item);
            }
        }

        return availableItems;
    }
}
    



import java.util.ArrayList;
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

        Point c = new Point (1, 1);
        System.out.println(c.angle());
        //worked

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
        //worked

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            intArr.add(0);
        }
        System.out.println(intArr.size());
        System.out.println(intArr.get(32));
        //worked

        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 8);
        System.out.println(grid);
        //worked

        String end = arrayToString(array);
        System.out.println(end);
        //worked

        Grid<Integer> intGrid = new Grid<>(3, 3);
        intGrid.set(0, 0, 1);
        intGrid.set(0, 1,2);
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
        //worked

        Grid<Integer> grid1 = new Grid<>(3, 4);
        Grid<Integer> grid2 = new Grid<>(5, 6);
        Grid<Integer> grid3 = new Grid<> (7, 8);
        System.out.println("Max Side Length: " + Grid.maxSideLength);
        //worked

        Point mid = new Point(0, 0);
        double radius = 5.0;
        Circle circle = new Circle(mid, radius);

        System.out.println("Circle 1: " + circle);

        Circle scaledCircle = circle.scale(6.5);
        System.out.println("Scaled Circle: " + scaledCircle);

        System.out.println("Area of Original Circle: " + circle.area());


    }

    static Integer[] array = {1, 2, 5, 6};
    static <T> String arrayToString(T[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        return str + arr[arr.length - 1] + "]";

    }
    //worked
}

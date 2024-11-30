public class RightTriangle implements Shape {
    private double base;
    private double height;
    private double x;
    private double y;

    public RightTriangle(double base, double height, double x, double y) {
        this.base = base;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    @Override
    public boolean isInside(Point p) {
        double dx = p.getX() - x;
        double dy = p.getY() - y;

        if (dx < 0||dy < 0||dx > base|| dy > height) {
            return false;
        }
        return dy <= (-height / base) * dx + height;
    }

    public boolean isOn(Point p) {
        double px = p.getX();
        double py = p.getY();

        if (py == y && px >= x && px <= x + base) {
            return true;
        }

        if (px == x && py >= y && py <= y + height) {
            return true;
        }

        double dx = px - x;
        double dy = py - y;
        if (dx >= 0 && dy >= 0 && dy <= base && dy <= height) {
            return Math.abs(dy - (-height/base) * dx - height) < 1e-9;
        }
        return false;
    }

    public RightTriangle translate(double dx, double dy) {
        return new RightTriangle(base, height, x + dx, y + dy);
    }

    public RightTriangle scale(double k){
        return new RightTriangle(base*k, height*k, x, y);
    }

    public static boolean similar(RightTriangle t1, RightTriangle t2) {
        double ratio1 = t1.base / t2.base;
        double ratio2 = t1.height / t2.height;
        return Math.abs(ratio1 - ratio2) < 1e-9;
    }
}

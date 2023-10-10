package OOP.L_Abstraction.PointInRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean greaterOrEqual(Point other) {
        return this.x <= other.getX() && this.y <= other.getY();
    }

    public boolean lessOrEqual(Point other) {
        return this.x >= other.getX() && this.y >= other.getY();
    }
}

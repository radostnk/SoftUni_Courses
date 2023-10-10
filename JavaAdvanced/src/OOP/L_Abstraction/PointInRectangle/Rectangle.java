package OOP.L_Abstraction.PointInRectangle;

public class Rectangle {
    private Point A;
    private Point C;

    public Rectangle(Point A, Point C) {
        this.A = A;
        this.C = C;
    }

//    public boolean contains(Point x) {
//        if (x.getX() <= this.C.getX() && x.getX() >= this.A.getX()) {
//            if (x.getY() <= this.C.getY() && x.getY() >= this.A.getY()) {
//                return true;
//            }
//            return false;
//        }
//        return false;
//    }

    public boolean contains(Point x) {
        return x.lessOrEqual(this.A) && x.greaterOrEqual(this.C);
    }
}

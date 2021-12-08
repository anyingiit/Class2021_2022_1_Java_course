package JClassHomework_21_12_1_H_1;

public class Line {
    private Point pointA, pointB;
    public Line(Point pointA, Point pointB){
        setPointA(pointA);
        setPointB(pointB);
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public double getLineLength() {
        return Math.sqrt(Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2));
    }
}

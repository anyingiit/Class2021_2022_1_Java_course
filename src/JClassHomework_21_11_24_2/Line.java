package JClassHomework_21_11_24_2;

public class Line {
    private double lineLineLength;
    public Line(Point pointA, Point pointB){
        this.lineLineLength = Math.sqrt(Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2));
    }

    public double getLineLineLength() {
        return lineLineLength;
    }
}

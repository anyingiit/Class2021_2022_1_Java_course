package JClassHomework_21_12_1_H_1;

public class Triangle {
    private Line lineA, lineB, lineC;

    public Triangle(Line lineA, Line lineB, Line lineC){
        setLineA(lineA);
        setLineB(lineB);
        setLineC(lineC);
    }

    public Triangle(Point pointA, Point pointB, Point pointC){
        setLineA(new Line(pointA, pointB));
        setLineB(new Line(pointB, pointC));
        setLineC(new Line(pointC, pointA));
    }

    private void setLineA(Line lineA) {
        this.lineA = lineA;
    }

    private void setLineB(Line lineB) {
        this.lineB = lineB;
    }

    private void setLineC(Line lineC) {
        this.lineC = lineC;
    }

    public Line getLineA() {
        return lineA;
    }

    public Line getLineB() {
        return lineB;
    }

    public Line getLineC() {
        return lineC;
    }

    public boolean isTriangle(){// 判断是否能组成三角形
        double a = lineA.getLineLength();
        double b = lineB.getLineLength();
        double c = lineC.getLineLength();
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double getTriangleArea(){// -1不满足三角形条件, 建议在使用前判断是否是三角形
        double a = lineA.getLineLength();
        double b = lineB.getLineLength();
        double c = lineC.getLineLength();
        if (!isTriangle()){
            return -1;
        }
        double p = (a+b+c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

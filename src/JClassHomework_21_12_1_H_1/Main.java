package JClassHomework_21_12_1_H_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(3, 0);
        Point pointC = new Point(0, 4);
        Line lineA = new Line(pointA, pointB);
        Line lineB = new Line(pointB, pointC);
        Line lineC = new Line(pointC, pointA);
        Triangle triangleA = new Triangle(lineA, lineB, lineC);
        System.out.print("triangleA: ");
        if (!triangleA.isTriangle()){
            System.out.println("不满足三角形条件");
        }else {
            System.out.println("满足三角形条件 - " + triangleA.getTriangleArea());
        }


        ArrayList<Integer> pointDatas = new ArrayList<Integer>();
        Scanner sin = new Scanner(System.in);
        for (int i = 1; i <= 3; i++){
            System.out.print("请输入点" + i + "X值: ");
            pointDatas.add(sin.nextInt());
            System.out.print("请输入点" + i + "Y值: ");
            pointDatas.add(sin.nextInt());
        }
        Point pointQ = new Point(pointDatas.get(0), pointDatas.get(1));
        Point pointW = new Point(pointDatas.get(2), pointDatas.get(3));
        Point pointE = new Point(pointDatas.get(4), pointDatas.get(5));

        Triangle triangleB = new Triangle(pointQ, pointW, pointE);// 同样也支持直接输入点进行计算三角面积
        System.out.print("triangleB: ");
        if (!triangleB.isTriangle()){
            System.out.println("不满足三角形条件");
        }else {
            System.out.println("满足三角形条件 - " + triangleB.getTriangleArea());
        }
        System.out.println("某同学 00000000000");
    }
}

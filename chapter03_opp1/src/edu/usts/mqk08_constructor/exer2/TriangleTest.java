package edu.usts.mqk08_constructor.exer2;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/22 14:24
 * @Version 1.0
 */
public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3.0, 5.0);
        Triangle t2 = new Triangle();
        TriangleTest test = new TriangleTest();
        //求解第一个对象
        double base = t1.getBase();
        double height = t1.getHeight();
        double area1 = test.getArea(base, height);
        System.out.printf("面积为:%s", area1);
        System.out.println();
        //求解第二个对象
        t2.setBase(2.0);
        t2.setHeight(5.0);
        double area2 = test.getArea(t2.getBase(), t2.getHeight());
        System.out.printf("面积为:%s", area2);
    }
    //计算三角形的面积
    public double getArea(double base, double height){
        return base * height / 2;
    }
}

package edu.usts.kight.kight01_static.apply;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/8 14:22
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(2.0);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(Circle.total);
    }
}
class Circle{
    //实例变量
    double radius;//半径
    int id;//编号
    static private int init = 1001;//自动给id赋值的基数
    //静态变量
    static int total;//创建Circle实例的个数
    public Circle(){
        this.id = init;
        init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}

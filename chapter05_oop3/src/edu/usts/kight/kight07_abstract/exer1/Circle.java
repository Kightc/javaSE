package edu.usts.kight.kight07_abstract.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/5 14:50
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;
    public Circle(double radius, String color, double weight){
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}

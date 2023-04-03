package edu.usts.kight.kight05_super.exer2;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/28 21:47
 * @Version 1.0
 */
public class Circle {
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return radius * radius * 3.14;
    }
}

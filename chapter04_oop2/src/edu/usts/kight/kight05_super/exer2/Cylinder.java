package edu.usts.kight.kight05_super.exer2;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/28 21:49
 * @Version 1.0
 */
public class Cylinder extends Circle {
    private double length;
    public Cylinder(){
        this.length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){//用super.调用父类的findArea()方法  否则默认调用子类重写的findArea()方法
        return super.findArea() * this.length;
    }
    public double findArea(){
        return (2 * 3.14 * getRadius() * this.length) + super.findArea() * 2;
    }
}

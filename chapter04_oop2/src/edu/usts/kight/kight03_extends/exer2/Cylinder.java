package edu.usts.kight.kight03_extends.exer2;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/28 21:49
 * @Version 1.0
 */
public class Cylinder extends Circle{
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
    public double findVolume(){
        return findArea() * this.length;
    }
}

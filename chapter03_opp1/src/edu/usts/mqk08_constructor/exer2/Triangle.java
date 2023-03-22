package edu.usts.mqk08_constructor.exer2;

/**
 * Description:
 * 编辑两个类：Triangle和TriangleTest，其中Triangle类中声明私有的底边长base和高height
 * 同时声明公共方法访问私有变量。此外提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积
 * @Author Kight
 * @Date 2023/3/22 14:13
 * @Version 1.0
 */
public class Triangle {
    private double base;
    private double height;

    public Triangle(){

    }
    public Triangle(double b, double h){
        base = b;
        height = h;
    }

    public double getBase(){
        return base;
    }
    public void setBase(double b){
        base = b;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height = h;
    }
}

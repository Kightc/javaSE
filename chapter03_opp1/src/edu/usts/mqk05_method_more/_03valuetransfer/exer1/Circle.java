package edu.usts.mqk05_method_more._03valuetransfer.exer1;

/**
 * Description:
 * 定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * @Author Kight
 * @Date 2023/3/13 22:04
 * @Version 1.0
 */
public class Circle {
    double radius;

    public double findArea(){
        return Math.PI * radius * radius;
    }
}

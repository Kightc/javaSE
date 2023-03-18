package edu.usts.mqk04_example.exer3;

/**
 * Description:
 * 利用面向对象的编程方法，设计类Circle计算圆的面积。
 * @Author Kight
 * @Date 2023/3/9 17:55
 * @Version 1.0
 */
public class Circle {
    //属性
    double radius;//半径
    //方法
    public void findArea(){
        System.out.println(3.14 * radius * radius);
    }

    public double findArea1(){
        return 3.14 * radius * radius;
    }
}

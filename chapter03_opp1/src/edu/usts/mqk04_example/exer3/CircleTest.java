package edu.usts.mqk04_example.exer3;

/**
 * Description:
 * 利用面向对象的编程方法，设计类Circle计算圆的面积。
 * @Author Kight
 * @Date 2023/3/9 17:59
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 4.0;
        circle1.findArea();
        System.out.println(circle1.findArea1());
        System.out.println();
//        BigDecimal num1 = new BigDecimal("0.1");
//        BigDecimal num2 = num1.add(new BigDecimal("0.2"));
//        System.out.println(num2);
    }
}

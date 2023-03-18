package edu.usts.mqk05_method_more._03valuetransfer.exer1;

/**
 * Description:
 * 定义一个Pass0bject类，在类中定义一个方法printAreas()，该方法的定义如下:
 * public void printAreas(Circle c, int time)。
 * 3．在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * @Author Kight
 * @Date 2023/3/13 22:11
 * @Version 1.0
 */
public class PassObject {
    public void printAreas(Circle c, int time){
        for (int i = 1; i <= time; i++) {
            c.radius = i;
            double areas = c.findArea();
            System.out.println(c.radius + "\t\t" + areas);
        }
    }
}

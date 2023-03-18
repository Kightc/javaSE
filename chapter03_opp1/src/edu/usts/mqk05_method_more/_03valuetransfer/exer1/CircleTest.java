package edu.usts.mqk05_method_more._03valuetransfer.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/13 22:17
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Radius" + "\t" + "Areas");
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c, 5);
    }
}

package edu.usts.kight.kight07_object.toString.exer;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/7 16:04
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle("blue", 1.0, 2.0);
        Circle c2 = new Circle("red", 1.0, 2.0);
        System.out.println("颜色是否相等?" + c1.getColor().equals(c2.getColor()));
        System.out.println("半径是否相等?" + c1.equals(c2));

        System.out.println(c1);
        System.out.println(c2);
    }
}

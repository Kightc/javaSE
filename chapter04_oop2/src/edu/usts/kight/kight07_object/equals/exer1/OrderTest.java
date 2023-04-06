package edu.usts.kight.kight07_object.equals.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/6 22:50
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order od1 = new Order(001, "Kight");
        Order od2 = new Order(001, "Kight");
        System.out.println(od1.equals(od2));
    }
}

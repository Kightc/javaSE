package edu.usts.kight.kight05_field;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/18 11:04
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Order order1 = new Order();
        System.out.println(order1.orderId);// 1

    }

}
class Order{
    int orderId = 1;
    {
        orderId = 2;
    }
    public Order(){
        orderId = 3;
    }
}

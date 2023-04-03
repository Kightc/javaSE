package edu.usts.kight.kight04_override.test1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/29 13:40
 * @Version 1.0
 */
public class OrderTest {
    public void method1(){
        Order order = new Order();
        order.orderDefault = 1;
        order.orderProtected = 1;
        order.orderPublic = 1;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();
        //受封装性的影响，私有属性不能再其他类中调用
//        order.orderPrivate = 1;
//        order.methodPrivate();

    }
}

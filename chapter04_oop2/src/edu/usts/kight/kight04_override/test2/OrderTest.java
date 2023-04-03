package edu.usts.kight.kight04_override.test2;

import edu.usts.kight.kight04_override.test1.Order;

/**
 * Description:
 *  其他包下的非子类
 * @Author Kight
 * @Date 2023/3/29 14:08
 * @Version 1.0
 */
public class OrderTest {
    public void method(){
        Order order = new Order();

        //调用属性
        order.orderPublic = 1;
        //调用方法
        order.methodPublic();


        //受封装性的影响，下面的情况不能访问
        //属性
//        order.orderProtected = 1;
//        order.orderProtected = 1;
//        order.orderPrivate = 1;
        //方法
//        order.methodProtrcted();
//        order.methodDefault();
//        order.methodPrivate();
    }
}

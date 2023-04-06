package edu.usts.kight.kight07_object.equals.exer1;

import java.util.Objects;

/**
 * Description:
 *  编写Order类，有int型的orderId，String类型的orderName，相对应的get()和set()方法，两个参数的构造器
 *  重写父类的equals()方法：public boolean equals(Object obj)，并判断测试类中的两个对象是否相等
 * @Author Kight
 * @Date 2023/4/6 22:48
 * @Version 1.0
 */
public class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    //手写一个equals()方法

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj instanceof Order order){
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Order order = (Order) o;
//        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
//    }

}

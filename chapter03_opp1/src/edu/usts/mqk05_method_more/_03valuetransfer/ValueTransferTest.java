package edu.usts.mqk05_method_more._03valuetransfer;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/13 20:09
 * @Version 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        //1.基本数据类型的额局部变量
        int m = 10;
        int n = m;
        System.out.println("m = " + m + " n =" + n);//m = 10, n  = 10
        m++;
        System.out.println("m = " + m + " n =" + n);//m = 11, n = 10

        //2.引用数据类型
        //2.1数组类型
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = arr1;
        arr2[0] = 10;
        System.out.println(arr1[0]);// 10

        //2.2对象类型
        Order order1 = new Order();
        order1.orderId = 1001;
        Order order2 = new Order();
        order2 = order1;
        order2.orderId = 1002;
        System.out.println(order1.orderId);/// 1002
    }
}

class Order {
    int orderId;
}

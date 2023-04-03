package edu.usts.kight.kight04_override.test2;

import edu.usts.kight.kight04_override.test1.Order;

/**
 * Description:
 *  其他包下的子类
 * @Author Kight
 * @Date 2023/3/29 13:59
 * @Version 1.0
 */
public class SubOrder extends Order {
    public void method1(){
        //调用属性
        orderProtected = 1;
        orderPublic = 1;
        //调用方法
        methodProtected();
        methodPublic();

        //受封装性的影响，不能被调用
        //属性
//        orderDefault = 1;
//        orderPrivate = 1;
        //方法
//        methodDefault();
//        methodPrivate();
    }
}

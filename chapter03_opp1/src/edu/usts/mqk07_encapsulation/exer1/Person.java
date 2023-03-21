package edu.usts.mqk07_encapsulation.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/19 15:03
 * @Version 1.0
 */
public class Person {
    private int age;//私有化属性age

    public int getAge(){//对外暴露获取属性age的方法
        return age;
    }
    public void setAge(int a){//对外暴露赋值属性age的方法
        if(a > 0 && a < 130){//判断实例参数是否非法
            age = a;
        }
        else
            System.out.println("你输入的年龄不合法，请重新输入:");
    }
}

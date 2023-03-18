package edu.usts.mqk01_oop;

public class PhoneTest {//其是Phone类的测试类
    public static void main(String[] args) {
        //创建Phone类的对象

        //复习：数据类型 变量名 = 变量值
        //Scanner sc = new Scanner(System.in);

        //创建Phone的对象
        Phone p1 = new Phone();

        //通过Phone的对象，调用其内部的属性和方法
        //格式：”对象.属性“ 或 ”对象.方法“
        p1.name = "huawei";
        p1.price = 5678.0;

        //调用属性
        System.out.println("name = " + p1.name + ", price = " + p1.price);

        //调用方法
        p1.call();
        p1.sendMessage("有内鬼，终止交易");
        p1.playGame();
    }
}

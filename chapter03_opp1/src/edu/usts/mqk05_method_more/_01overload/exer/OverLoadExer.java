package edu.usts.mqk05_method_more._01overload.exer;

/**
 * Description:
 *  练习1：
 *  编写程序，定义三个重载方法并调用。方法名为mOL。
 *  三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 *  练习2：
 *  定义三个重载方法max():
 *  第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，
 *  第三个方法求三个double值中的最大值，并分别调用三个方法。
 * @Author Kight
 * @Date 2023/3/13 14:43
 * @Version 1.0
 */
public class OverLoadExer {
    public void mOL(int num1) {
        System.out.println("接受的参数为:" + num1);
    }

    public void mOL(int num1, int num2) {
        System.out.println("接受的两个参数为:" + num1 + "和" + num2);
    }

    public void mOL(String str) {
        System.out.println("接收的String参数为:" + str);
    }

    public int max(int num1, int num2) {
        return (num1 >= num2) ? num1 : num2;
    }

    public double max(double num1, double num2) {
        return (num1 >= num2) ? num1 : num2;
    }

    public double max(double num1, double num2, double num3) {
        return (max(num1, num2) >= num3) ? max(num1, num2) : num3;
    }
}

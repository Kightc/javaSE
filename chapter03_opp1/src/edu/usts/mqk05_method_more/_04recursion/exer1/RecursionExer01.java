package edu.usts.mqk05_method_more._04recursion.exer1;

/**
 * Description:
 * 已知一个数列：f(20) = 1,f(21) = 4,f(n + 2) = 2 * f(n + 1) + f(n)
 * 其中n是大于0的整数，求f(10)的值
 *
 * @Author Kight
 * @Date 2023/3/17 18:13
 * @Version 1.0
 */
public class RecursionExer01 {
    //已知一个数列：f(20) = 1,f(21) = 4,f(n + 2) = 2 * f(n + 1) + f(n)
    //其中n是大于0的整数，求f(10)的值

    public static void main(String[] args) {
        RecursionExer01 test = new RecursionExer01();
        System.out.println(test.f1(10));
        System.out.println(test.f2(10));
    }

    public int f1(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f1(n + 2) - 2 * f1(n + 1);//想着已知的方向递归
            //错误的写法
//            return 2*f(n - 1) + f(n - 2);
        }
    }

    //已知有一个数列：f(0) = 1,f(1) = 4
    //f(n + 2) = 2*f(n + 1) + f(n),其中n是大于0的整数，求f(10)的值。
    public int f2(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f2(n - 1) + f2(n - 2);
        }
    }
}

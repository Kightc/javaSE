package edu.usts.mqk05_method_more._03valuetransfer.interview;

import java.io.PrintStream;

/**
 * Description:
 * public class Test{
 *     public static void main(String[] args){
 *         int a = 10;
 *         int b = 10;
 *         method(int a, int b);//此处需要在method方法被调用后，仅打印出a = 100,b = 200，请写出method
 *         方法的代码
 *         System.out.println("a = " + a);
 *         System.out.println("b = " + b);
 *     }
 * }
 * @Author Kight
 * @Date 2023/3/14 8:34
 * @Version 1.0
 */
public class Answer {
    //错误做法
    public static void method0(int a, int b){
        a *= 10;
        b *= 20;
    }

    //正确做法一：
    public static void method1(int a, int b){
        a *= 10;
        b *= 20;
        System.out.println("a=" + a + "," + "b=" + b);
        System.exit(0);//执行完此行命令后程序自动结束运行，执行不到后续的输出方法
    }

    //正确做法二：
    public static void method2(int a, int b){
        PrintStream ps = new PrintStream(System.out){
            public void println(String x){
                if ("a=10".equals(x)){
                    x = "a=100";
                }
                else if("b=10".equals(x)){
                    x = "b=200";
                }
                super.println(x);
            }
        };
        System.setOut(ps);
    }
}

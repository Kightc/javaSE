package edu.usts.mqk05_method_more._04recursion;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/14 9:01
 * @Version 1.0
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        System.out.println(test.getSum(100));
        System.out.println(test.getSum1(100));
        System.out.println(test.getMul(5));
        System.out.println(test.f(10));

    }

//    public void method1(){//执行此方法会导致栈溢出
//        System.out.println("method1()...");
//        method1();
//    }

    //举例1：计算1-100内自然数的和
    //方法一：
    public int getSum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
    //方法二：
    public int getSum1(int num){
        if (num == 1){
            return 1;
        }
        else{
            return getSum(num - 1) + num;
        }
    }


    //举例2：计算n!
    public int getMul(int num){
        if (num == 1){
            return 1;
        }
        else {
            return getMul(num - 1) * num;
        }
    }

    /**
     * 举例3：快速排序
     */


    /**
     * 举例4：汉诺塔
     */

    /**
     * 举例5：斐波那契数列
     */
    public int f(int n){
        if(n == 1)
            return 1;
        else if(n == 2)
            return 1;
        else
            return f(n - 1) + f(n - 2);
    }

    /**
     * 举例6：
     * File类的对象表示一个文件目录
     */
}

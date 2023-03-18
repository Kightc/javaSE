package edu.usts.mqk05_method_more._02args;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/13 16:59
 * @Version 1.0
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest test = new ArgsTest();
        test.print();
        test.print(1);
        test.print(1, 2);
    }
    public void print(int ... nums){
        System.out.println("hello");
    }
    public void print(int num){
        System.out.println("hi");
    }
    public void print(int num1, int num2){
        System.out.println("你好啊");
    }
}

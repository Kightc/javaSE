package edu.usts.mqk05_method_more._03valuetransfer;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/13 20:43
 * @Version 1.0
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 test1 = new ValueTransferTest1();
        //1.对于基本数据类型的变量来说
        int m = 10;
        test1.method1(m);
        System.out.println(m);//10

        //对于应用数据类型的变量来说
        Person p = new Person();
        p.age = 10;
        test1.method2(p);
        System.out.println(p.age);//11
    }


    public void method1(int m){
        m++;
    }
    public void method2(Person p){
        p.age++;
    }
}

class Person{
    int age;
}

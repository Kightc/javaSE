package edu.usts.kight.kight02_singleton;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/9 15:57
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}
//饿汉式
class Bank{
    //1.类的构造器私有化
    private Bank(){

    }
    //2.在类的内部创建当前类的实例
    //此属性也必须声明为static
    private static Bank instance = new Bank();
    //3.使用getxxx()方法获取当前类的实例，必须声明为static
    public static Bank getInstance(){
        return instance;
    }
}

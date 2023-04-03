package edu.usts.kight.kight06_polymorphism;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/3 14:19
 * @Version 1.0
 */
public class Man extends Person{
    boolean isSmoking;
    int id = 1002;

    public void eat(){
        System.out.println("man 干饭");
    }
    public void walk(){
        System.out.println("man walk walk walk!!!");
    }

    public void earnMoney(){
        System.out.println("man 挣钱啊!");
    }
}

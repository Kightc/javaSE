package edu.usts.kight.kight06_polymorphism;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/3 14:29
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        //多态性之前的场景:
        Person p1 = new Person();
        Man m1 = new Man();

        //多态性:子类对象的多态性
        Person p2 = new Man();

        /*
            多态性的应用:虚拟方法调用 或(虚方法调用)
            在多态的场景下调用方法时
                编译时，认为方法时左边声明的父类的类型(被重写的方法)
                执行时，实际执行的是子类重写父类的方法
            简称为：编译看左边，运行看右边
         */
        p2.eat();
        p2.walk();

        //测试属性是否有多态性  不满足
        System.out.println(p2.id);
        /*
            多态的弊端
            问题：
                Person p2 = new Man();
                针对于创建的对象p2，在内存中是否加载了Man类中特有的属性个和方法？加载了！
                能不能直接调用Man类中加载的特有的属性和方法呢？不能
         */
//        p2.earnMoney();
//        System.out.println(p2.isSmoking);
    }
}

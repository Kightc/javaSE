package edu.usts.kight.kight04_block;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/9 17:11
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        System.out.println(p1.age);
    }
}
class Person{
    String name;
    int age;
    public Person(){

    }
    public void eat(){
        System.out.println("干饭!");
    }

    //非静态代码块
    {
        System.out.println("非静态代码块1");
        age = 1;
    }
    {
        System.out.println("非静态代码块2");
    }

    //静态代码块
    static{
        System.out.println("静态代码块1");
    }
    static {
        System.out.println("静态代码块2");
    }

}

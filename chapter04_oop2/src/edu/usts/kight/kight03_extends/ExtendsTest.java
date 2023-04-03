package edu.usts.kight.kight03_extends;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/28 16:43
 * @Version 1.0
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.eat();


        Student s1 = new Student();
        s1.name = "Kight";
        s1.eat();
        s1.study();
        //获取s1的父类
        System.out.println(s1.getClass().getSuperclass());
        //获取p1的父类
        System.out.println(p1.getClass().getSuperclass());
    }
}

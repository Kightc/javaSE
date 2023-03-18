package edu.usts.mqk04_example.exer1;

/**
 * Description:
 * 创建对象并调其中的方法
 * @Author Kight
 * @Date 2023/3/9 17:02
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建对象
        Person p1 = new Person();
        //调用属性
        p1.name = "Kight";
        p1.age = 18;
        p1.gender = '男';
        p1.study();
        p1.addAge(2);
        int age = p1.showAge();
        System.out.println("age = " + age);

        //再创建一个对象
        Person p2 = new Person();
        System.out.println(p2.age);//0
        p2.addAge(10);
        System.out.println(p2.showAge());

    }
}

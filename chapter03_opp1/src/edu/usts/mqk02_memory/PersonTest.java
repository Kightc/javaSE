package edu.usts.mqk02_memory;

public class PersonTest {
    public static void main(String[] args) {
        //类的实例化
        Person p1 = new Person();

        //通过对象调用属性和方法
        //调用类的属性
        p1.name = "马奇康";
        p1.age = 18;
        p1.gender = '男';
        System.out.println(p1);

        //调用类的方法
        p1.eat();
        p1.sleep(8);
        p1.interests("打坤拳");

        //再创建Person类的一个实例
        Person p2 = new Person();
        p2.name = "露丝";
        p2.age = 18;
        p2.gender = '女';
        System.out.println(p2);
    }
}

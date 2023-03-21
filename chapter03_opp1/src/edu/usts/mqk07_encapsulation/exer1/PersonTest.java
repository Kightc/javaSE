package edu.usts.mqk07_encapsulation.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/19 15:07
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的实例
        Person b = new Person();
        b.setAge(21);
        System.out.printf("年龄为: %s", b.getAge());
    }
}

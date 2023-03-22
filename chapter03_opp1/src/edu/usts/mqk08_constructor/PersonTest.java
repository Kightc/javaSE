package edu.usts.mqk08_constructor;

import java.sql.SQLOutput;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/21 11:21
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Kight",20);
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p2.age);
        System.out.println(p2.name);
    }


}

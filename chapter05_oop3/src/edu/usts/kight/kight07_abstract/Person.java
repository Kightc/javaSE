package edu.usts.kight.kight07_abstract;

import java.sql.SQLOutput;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/19 11:02
 * @Version 1.0
 */
public abstract class Person extends Creature {
    String name;
    int age;
    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();
    public abstract void sleep();

}

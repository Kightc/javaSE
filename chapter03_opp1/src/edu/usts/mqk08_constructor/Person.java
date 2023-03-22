package edu.usts.mqk08_constructor;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/21 11:20
 * @Version 1.0
 */
public class Person {
    String name;
    int age;

    //构造器(无参)
    public Person(){

    }

    //构造器(有参)
    public Person(String n){
        name = n;
    }
    public Person(int a){
        age = a;
    }
    public Person(String n, int a){
        name = n;
        age = a;
    }

    public void eat(){
        System.out.println("干饭!");
    }

    public void sleep(int hour){
        System.out.printf("人每天睡%s小时", hour);
    }
}

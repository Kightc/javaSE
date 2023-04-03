package edu.usts.kight.kight01_this;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/26 17:07
 * @Version 1.0
 */
public class PersonTest {

}

class Person {
    private String name;
    private int age;

    public Person() {

    }

    //    public Person(String n, int a){
//        name = n;
//        age = a;
//    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public void setAge(int a){
//        age = a;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void eat() {
        System.out.println("干饭");
//        sleep();
        this.sleep();
    }

    public void sleep() {
        System.out.println("睡觉:");
    }
}

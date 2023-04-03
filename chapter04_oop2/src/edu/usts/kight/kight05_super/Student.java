package edu.usts.kight.kight05_super;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/28 16:41
 * @Version 1.0
 */
public class Student extends Person {
    //属性
//    String name;
//    int age;
    String school;
    int id = 1002;//学号

    public void study() {
        System.out.println("学习!");
    }

    public void eat() {
        System.out.println("多吃脑白金啊!");
    }

    public void sleep() {
        System.out.println("睡觉？四个小时就够了!");
    }

    //测试super调用方法、属性
    public void show() {
        eat();//相当于省略了this.
        super.eat();
    }

    public void show1() {
        //现在本类中找
        doSport();//相当于省略的this.
        //直接越过了本类，去父类中直接找
        super.doSport();
    }

    public void show2() {
        System.out.println(id);//相当于this.id   打印出1002
        System.out.println(super.id);//调用父类的id 打印出1001
    }

    public void show3() {
        System.out.println(name);
    }

    //测试super调用父类构造器
    public Student(){
        super();
        System.out.println("Student()...");
    }
    public Student(String name, int id){

    }
}

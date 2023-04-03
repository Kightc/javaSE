package edu.usts.kight.kight04_override;

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
    //方法
//    public void eat(){
//        System.out.println("干饭!");
//    }
//
//    public void sleep(){
//        System.out.println("睡觉!");
//    }
    public void study(){
        System.out.println("学习!");
    }
    public void eat(){
        System.out.println("学生要多吃饭");
    }
}

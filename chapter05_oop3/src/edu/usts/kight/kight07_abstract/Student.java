package edu.usts.kight.kight07_abstract;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/19 11:05
 * @Version 1.0
 */
public class Student extends Person{
    String school;

    public Student() {

    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    public void eat(){
        System.out.println("students eat food");
    }
    public void sleep(){
        System.out.println("students sleep");
    }
    public void breath(){
        System.out.println("students breath");
    }
}

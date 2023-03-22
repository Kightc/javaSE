package edu.usts.mqk08_constructor.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/22 13:54 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("Kight",20);
        Student stu2 = new Student("Lucy", 20, "usts");
        Student stu3 = new Student("Wansi", 21,"usts", "cs");
        System.out.println(stu1.getInfo());
        System.out.println(stu2.getInfo());
        System.out.println(stu3.getInfo());
    }
}

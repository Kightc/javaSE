package edu.usts.kight.kight05_super;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/29 20:09
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.eat();
        s1.show();

        s1.show2();
        System.out.println("*********************");

        Student s2 = new Student();

        System.out.println("****************");
        //测试④
        Student s3 = new Student("Kight", 20);
    }
}

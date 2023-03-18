package edu.usts.mqk04_example.exer5_objarr1;

/**
 * Description:
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一:打印出3年级(state值为3）的学生信息。
 * 问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * @Author Kight
 * @Date 2023/3/11 15:37
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建Student[]
        Student[] student = new Student[20];
        StudentUtil Students = new StudentUtil();
        //给student中的，每一个元素的属性赋值
        Students.createStudents(student,student.length);
        //打印出年级为3的学生信息
        Students.printStudentsWithIndex(student,3);
        //按照成绩升序排列（冒泡排序）
        Students.printStudentsWithSortOfBubble(student);
    }
}

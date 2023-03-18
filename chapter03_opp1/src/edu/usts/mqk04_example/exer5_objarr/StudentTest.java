package edu.usts.mqk04_example.exer5_objarr;

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
        //给student中的，每一个元素的属性赋值
        for (int i = 0; i < 20; i++) {
            student[i] = new Student();
            student[i].number = i + 1;
            student[i].state = (int)(Math.random() * 6 + 1);
            student[i].score = (int)(Math.random() * 101);
        }
        //打印出年级为3的学生信息
        for (int i = 0; i < 20; i++) {
            if(student[i].state == 3){
//                System.out.println("学号为:" + student[i].number + "年级为:" + student[i].state +
//                        "成绩为:" + student[i].score);
                System.out.println(student[i]);
            }
        }
        //按照成绩升序排列（冒泡排序）
        for (int i = 0; i < student.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < student.length - i - 1 ; j++) {
                if(student[j].score > student[j + 1].score){
                    Student temp  = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        //打印出排序后的结果
        System.out.println("按成绩升序排序后:");
        for (int i = 0; i < student.length; i++) {
//            System.out.println("学号为:" + student[i].number + "年级为:" + student[i].state +
//                    "成绩为:" + student[i].score);
            System.out.println(student[i]);
        }
    }
}

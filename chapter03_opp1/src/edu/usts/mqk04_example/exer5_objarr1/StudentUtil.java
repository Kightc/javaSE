package edu.usts.mqk04_example.exer5_objarr1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/11 16:30
 * @Version 1.0
 */
public class StudentUtil {

    /**
     * 生成数组
     *
     * @param students
     * @param num
     */
    public void createStudents(Student[] students, int num) {
        for (int i = 0; i < num; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }
    }

    /**
     * 打印指定年级的学生信息
     */
    public void printStudentsWithIndex(Student[] students, int state) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == state) {
//                System.out.println("学号为:" + student[i].number + "年级为:" + student[i].state +
//                        "成绩为:" + student[i].score);
                System.out.println(students[i]);
            }
        }
    }

    /**
     * 按照score进行冒泡排序（升序）并打印
     *
     * @param students
     */
    public void printStudentsWithSortOfBubble(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        //打印出排序后的结果
        System.out.println("按成绩升序排序后:");
        for (int i = 0; i < students.length; i++) {
//            System.out.println("学号为:" + student[i].number + "年级为:" + student[i].state +
//                    "成绩为:" + student[i].score);
            System.out.println(students[i]);
        }
    }


}

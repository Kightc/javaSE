package array_01.exer1;

import java.util.Scanner;

public class ArrayExer2 {
    public static void main(String[] args) {

        System.out.println("请输入学生的人数:");
        Scanner sc = new Scanner(System.in);
        int stuNum = sc.nextInt();
        int maxGrade = 0;
        int[] stuArr = new int[stuNum];
        System.out.println("请依次输入学生的成绩:");

        for (int i = 0; i < stuNum; i++) {
            int stuGrade = sc.nextInt();
            stuArr[i] = stuGrade;
//            maxGrade = stuGrade > maxGrade ? stuGrade : maxGrade;
            maxGrade = Math.max(stuGrade, maxGrade);
        }
        System.out.println("最高分为:" + maxGrade);
        for (int i = 0; i < stuNum; i++) {
            System.out.println("第" + (i + 1) + "位同学的成绩为:" + judgment(stuArr[i]));
        }
    }

    public static char judgment(int grade) {
        if (90 <= grade && grade <= 100) {
            return 'A';
        } else if (80 <= grade) {
            return 'B';
        } else if (70 <= grade) {
            return 'C';
        } else if (60 <= grade) {
            return 'D';
        }
        return 'E';
    }
}

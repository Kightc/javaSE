/*
“无限”循环结构的使用
1.格式：while(true) 或 for(;;)
2.开发中，有时不确定需要循环多少次，需要根据循环体内部的某些条件，来控制循环的结束（使用break）
3.如果此循环结构不能终止，则构成了死循环，开发中需要避免出现死循环。
 */


import java.util.Scanner;

public class ForWhileTest {
    public static void main(String[] args) {
//        while(true){
//            System.out.println("我永远爱你！");
//        }//不建议执行

        //案例：从键盘中读取个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
        int positiveCount = 0;
        int negativeCount = 0;

        Scanner sc = new Scanner(System.in);
        int num1;
        for (; ; ) {
            System.out.println("请输入整数：");
            num1 = sc.nextInt();
            if (num1 > 0) {
                positiveCount++;
            } else if (num1 < 0) {
                negativeCount++;
            } else {
                System.out.println("程序结束！");
                break;
            }
        }
        System.out.println("正数的个数为：" + positiveCount + "个");
        System.out.println("负数的个数为：" + negativeCount + "个");

//        while (true) {
//            System.out.println("请输入整数：");
//            num1 = sc.nextInt();
//            if (num1 > 0) {
//                positiveCount++;
//            } else if (num1 < 0) {
//                negativeCount++;
//            } else {
//                System.out.println("程序结束！");
//                break;
//            }
//        }
//        System.out.println("正数的个数为：" + positiveCount + "个");
//        System.out.println("负数的个数为：" + negativeCount + "个");
    }
}

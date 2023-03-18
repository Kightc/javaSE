/*
break和continue关键字的使用
    使用范围：
        break：switch-case
               循环结构-作用是结束（或跳出）当前循环结构

        continue:循环结构中-作用是结束（或跳出）当次循环
    相同点：在这两个关键字后面不能声名执行语句


 */


import org.junit.Test;

public class BreakContinueTest {
    public static void main(String[] args) {
 /*       for (int i = 1; i <= 10; i++) {
//            if (i % 4 == 0){
//                break;
//            }
            if (i % 4 == 0) {
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 10; i++) {
                if (i % 4 == 0) {
                    //break;
                    continue;
                }
                System.out.print(i);
            }
            System.out.println();
        }
        //了解，利用label标签退出最外层循环。
        label:
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    //break label;
                    continue label;
                }
                System.out.print(j);
            }
            System.out.println();
        }*/

        int count = 0;
        long start = System.currentTimeMillis();

        for (int i = 2; i <= 100000; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("质数的个数为：" + count);
        System.out.println("所花费的时间为：" + (end - start) + "ms");

     
    }

    static boolean isPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

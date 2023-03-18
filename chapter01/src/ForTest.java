import java.util.Scanner;
/*
1.Java中的三种循环结构： for、while、do-while
2.凡是循环结构，就一定会有四个要素：
    ①初始化条件
    ②循环条件 --一定是boolean类型变量或者表达式
    ③循环体
    ④迭代部分
3.for循环格式
for(①;②;④){
    ③
}
执行过程：① - ② - ③ - ④ - ② - ③ - ④  - ...... - ②


说明：
    循环结构中，一旦执行break，则跳出当前循环结构 -- 强制结束
        如何结束一个循环结构？
            方式1.循环条件不满足
            方式2.执行了break语句
*/


public class ForTest {
    public static void main(String[] args) {
        //需求1：输出5行HelloWorld
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloWorld");
        }
        //需求2：显示执行过程
        int num = 1;
        for (System.out.println("a"); num < 3; System.out.println("c"), num++) {
            System.out.println("b");
        }

        //需求3:遍历1-100范围内的所有偶数，获取偶数的个数并求和
        int num1 = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                num1++;
                sum += i;
            }
        }
        System.out.println("偶数的个数为:" + num1);//偶数个数
        System.out.println("其中所有偶数的和为:" + sum);//求和

        //需求4：输出所有的水仙花数,所谓的水仙花数是指一个三位数，其各个位置上的数的立方和等于这个数本身
        for (int i = 100; i <= 999; i++) {
            if (isShui(i)) {
                System.out.println(i);
            }
        }
        //需求5：输入两个正数 m 和 n ，求其最大公约数和最小公倍数。
        Scanner sc = new Scanner(System.in);
        System.out.println("输入正整数m:");
        int m = sc.nextInt();
        System.out.println("输入正整数n:");
        int n = sc.nextInt();
        /*
        int yue = 0;
        int bei = 0;

        */
        int min = (m > n) ? n : m;
        int max = (m > n) ? m : n;
        /*
        for(int i = 1; i <= m || i <= n; i++){
            if (m % i == 0 && n % i == 0){
                yue = i;
            }
        }
        */

        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为:" + i);
                break;
            }
        }
        /*
        for(int i = m * n; i >= m || i >= n; i--){
            if (i % m == 0 && i % n == 0){
                bei = i;
            }
        }
        System.out.println("最大公约数为:" + yue );
        System.out.println("最小公倍数为:" + bei );
        */
        for (int i = max; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数为:" + i);
                break;
            }
        }



    }
    //判断是否为水仙花数
    static boolean isShui(int num) {

        int a = num % 10;
        int b = (num / 10) % 10;
        int c = num / 100;
        return num == Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
    }
}

/*
1.while循环格式
    ①
    while(②){
        ③
        ④
   }
2.执行过程
① - ② - ③ - ④ - ② - ③ - ④ .....

3.for循环和while可以相互转换

 */


import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {


        //需求1；遍历5次HelloWorld
        int i = 1;
        while (i <= 5) {
            System.out.println("HelloWorld");
            i++;//一定不可以省去，否则进入死循环
        }
        //需求2：遍历1-100范围内的所有偶数，获取偶数的个数并求和
        int j = 1;
        int count = 0;
        int sum = 0;
        while (j <= 100) {
            if (j % 2 == 0) {
                count++;
                sum += j;
            }
            j++;
        }
        System.out.println("偶数的个数为:" + count);
        System.out.println("偶数的和为:" + sum);

        //需求3：随机生成一个100以内的整数，猜这个数是多少，从键盘上输入数，如果大了，提示大了，如果小了，提示小了；
        //如果对了，则提示对了并且不用猜了,统计一共猜了多少次
//        int num = (int) (Math.random() * 100 + 1);
//        System.out.println("请输入一个整数开始猜测:");
//        Scanner sc = new Scanner(System.in);
//        int gnum;
//        int gcount = 1;
//        while ((gnum = sc.nextInt()) != num) {
//            //if (gnum < num) System.out.println("猜小了，请继续猜:");
//            //else System.out.println("猜大了，请继续猜:");
//            System.out.println(gnum < num ? "猜小了，请继续猜:" : "猜大了，请继续猜:");
//            gcount++;
//        }
//        System.out.println("猜对了，一共猜了" + gcount + "次");

        //需求3：加入提供一张足够大的纸，它的厚度为0.1毫米，折纸多少次可以折到珠穆朗玛峰的高度（8848.86米）
        double zhuHeight = 8848.86;
        int times = 0;
        double depth = 0.1 * Math.pow(10,-3);
        while (depth <= zhuHeight){
            depth *= 2;
            times++;
        }
        System.out.println("折纸" + times + "次就可以达到珠穆朗玛峰的高度\n" + "此时纸的厚度为：" + depth);

    }
}

package edu.usts.kight.kight03_main;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/9 16:49
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {//看做是程序的入口
        String[] arr = new String[]{"aa", "bb", "cc", "dd"};
        Main.main(arr);
    }
}
class Main{
    public static void main(String[] args) {//看做是普通的静态方法
        System.out.println("Main中的main()方法的调用");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
    }
}

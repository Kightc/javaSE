//导入包
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //创建一个实例对象
        Scanner sc = new Scanner(System.in);
        System.out.print("please input your name: " );
        //调用Scanner类中的方法  获取指定类型的变量
        String name = sc.next();
        System.out.println("name:" + name);
        System.out.print("please input your age:");
        int age = sc.nextInt();
        System.out.println("age:" + age);
        sc.close();  //防止内存的泄露
    }
}


/*
1.do-while格式
    ①
    do{
        ③
        ④
    }while(②)
 2.执行过程：
 ① - ③ - ④ - ② - ③ - ④ - ... - ②
 3.说明：
    do-while循环至少会执行一次循环体
 */


import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        //需求1：遍历100以内的偶数，输出偶数的个数以及他们的和
        int i = 1;
        int count = 0;
        int sum = 0;
        do {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
            i++;//不可以缺失，否则进入死循环
        } while (i <= 100);
        System.out.println("偶数的个数为：" + count + "\n他们的和为：" + sum);

        //需求2：模拟ATM取款
        //声明变量balance并初始化为0，用以表示银行账户余额，具备以下功能
        //1、取款
        //2、存款
        //3、查询余额
        //4、退出
        int choice;
        int smoney;
        int dmoney;
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("====ATM====" + "\n 1、存款" + "\n 2、取款" + "\n 3、查询余额" + "\n 4、退出" + "\n 请选择(1-4)：");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入你想要存款的金额：");
                    smoney = sc.nextInt();
                    balance += smoney;
                    break;
                case 2:
                    System.out.println("请输入你想要取款的金额：");
                    dmoney = sc.nextInt();
                    if (balance >= dmoney)
                        balance -= dmoney;
                    else
                        System.out.println("没那么多钱！");
                    break;
                case 3:
                    System.out.println("你的余额为：" + balance);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (choice != 4);
        sc.close();
    }
}


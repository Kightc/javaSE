package edu.usts.kight.kight05_super.exer3;

/**
 * Description:
 *  写一个用户程序测试Account类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%的Account对象。
 *  使用withdraw方法提款30000元，并打印余额。
 *  再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率。
 * @Author Kight
 * @Date 2023/3/30 12:10
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account ac1 = new Account(1122, 20000, 0.045);

        ac1.withdraw(30000);
        double balance = ac1.getBalance();
        System.out.println("余额为:" + balance);
        ac1.withdraw(2500);
        ac1.deposit(3000);
        System.out.println("余额:");
        System.out.println(ac1.getBalance());
        System.out.println("月利率:");
        System.out.println(ac1.getMonthlyInterest());
    }
}

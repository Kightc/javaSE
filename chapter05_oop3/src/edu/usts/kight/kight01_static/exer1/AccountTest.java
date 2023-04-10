package edu.usts.kight.kight01_static.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/8 15:58
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        System.out.println(acc1);
        Account acc2 = new Account("123456", 5000);
        System.out.println(acc2);

        Account.setInterestRate(0.0123);
        Account.setMinBalance(10);
        System.out.println("利率为：" + Account.getInterestRate());
        System.out.println("最小的存款额度为：" + Account.getMinBalance());
    }
}

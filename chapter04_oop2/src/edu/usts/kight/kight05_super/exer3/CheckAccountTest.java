package edu.usts.kight.kight05_super.exer3;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/31 16:16
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045,
                5000);
        checkAccount.withdraw(5000);
        System.out.println("余额为:");
        System.out.println(checkAccount.getBalance());
        System.out.println("可透支额度为:");
        System.out.println(checkAccount.getOverdraft());
        System.out.println("**********************************");

        checkAccount.withdraw(18000);
        System.out.println("余额为:");
        System.out.println(checkAccount.getBalance());
        System.out.println("可透支额度为:");
        System.out.println(checkAccount.getOverdraft());
        System.out.println("**********************************");

        checkAccount.withdraw(3000);
        System.out.println("余额为:");
        System.out.println(checkAccount.getBalance());
        System.out.println("可透支额度为:");
        System.out.println(checkAccount.getOverdraft());
    }
}

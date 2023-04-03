package edu.usts.kight.kight01_this.exer2;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/27 15:58
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("操", "曹");
        bank.addCustomer("备", "刘");

        bank.getCustomer(0).setAccount(new Account(2000.0));
        bank.getCustomer(0).getAccount().withdraw(50.0);
        System.out.println(bank.getCustomer(0).getAccount().getBalance());

        bank.getCustomer(1).setAccount(new Account(3000.0));

    }
}

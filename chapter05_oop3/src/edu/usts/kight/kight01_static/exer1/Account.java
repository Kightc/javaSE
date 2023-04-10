package edu.usts.kight.kight01_static.exer1;

/**
 * Description:
 *  编写一个实现银行账户的概念，包含的属性有 账号、密码、存款余额、利率、最小余额，定义封装这些属性
 *  账号要自动生成
 * @Author Kight
 * @Date 2023/4/8 15:47
 * @Version 1.0
 */
public class Account {
    private int id;//账号
    private String password;//密码
    private double balance;//余额
    private static double interestRate;//利率
    private static double minBalance;//最小余额
    private static int init = 1001;//用于自动生成id的基数

    public Account() {
        this.id = init;
        init++;
        password = "000000";
    }

    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}

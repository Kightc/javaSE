package edu.usts.mqk08_constructor.exer3;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/22 15:05
 * @Version 1.0
 */
public class Account {
    //定义相关属性
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    //构造器
    public Account() {

    }
    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double a) {
        annualInterestRate = a;
    }

    /**
     * 取钱
     *
     * @param amount
     */
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("您的余额不足!");
        } else {
            balance -= amount;
            System.out.println("成功取出" + amount + "元!");
        }
    }

    /**
     * 存钱
     *
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println("成功存入" + amount + "元!");
    }

}

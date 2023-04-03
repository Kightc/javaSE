package edu.usts.kight.kight01_this.exer2;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/27 15:16
 * @Version 1.0
 */
public class Account {
    private double balance;//余额
    public Account(double init_balance){
        this.balance = init_balance;
    }
    public double getBalance(){
        return balance;
    }
    //存钱
    public void deposit(double amt){
        balance += amt;
        System.out.println("成功存入");
    }
    //取钱
    public void withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
            System.out.println("成功取出" + amt + "元!");
        }else
            System.out.println("您的余额已不足!");
    }
}
